package eu.janietz.java9.streams;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/**
 * Created by booth02-mgr2 on 16.07.2017.
 */
public class ReactiveStreams {

    public static void main(String[] args) {
        SubmissionPublisher<String> logPublisher = new SubmissionPublisher<>(Executors.newCachedThreadPool(), 256);
        LogSubscriber logSubscriber = new LogSubscriber();
        LogProcessor logProcessor = new LogProcessor();
        logPublisher.subscribe(logProcessor);
        logProcessor.consume(System.out::println);
        //logPublisher.subscribe(logSubscriber);
        //logPublisher.offer("Text", 5000, TimeUnit.MILLISECONDS, (s, el) -> true);
        //logPublisher.close();
        logPublisher.submit("Text");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class LogSubscriber implements Flow.Subscriber<String> {

        @Override
        public void onSubscribe(Flow.Subscription subscription) {
            subscription.request(Long.MAX_VALUE);
        }

        @Override
        public void onNext(String item) {
            System.out.println(item);
        }

        @Override
        public void onError(Throwable throwable) {
            System.out.println("Error occured");
            throwable.printStackTrace();
        }

        @Override
        public void onComplete() {
            System.out.println("Completed");
        }
    }

    static class LogProcessor extends SubmissionPublisher<String> implements Flow.Processor<String, String>, Flow.Subscriber<String> {

        @Override
        public void onSubscribe(Flow.Subscription subscription) {
            subscription.request(Long.MAX_VALUE);
        }

        @Override
        public void onNext(String item) {
            this.submit("[" + new Date().toString() + "] " + item);
        }

        @Override
        public void onError(Throwable throwable) {
            this.getExecutor().execute(() -> this.getSubscribers().forEach(s -> s.onError(throwable)));
        }

        @Override
        public void onComplete() {
            this.close();
        }
    }

}
