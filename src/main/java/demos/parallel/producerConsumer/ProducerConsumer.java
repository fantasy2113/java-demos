package demos.parallel.producerConsumer;

import java.util.Vector;

public class ProducerConsumer {
    public static void main(String[] args) {

        Vector sharedResource = new Vector();

        Producer producerA = new Producer(sharedResource, "A");
        Consumer consumerB = new Consumer(sharedResource, "B");

        producerA.start();
        consumerB.start();
    }
}
