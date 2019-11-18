package demos.parallel.producerConsumer;

import java.util.Vector;

public class Producer extends Thread {
    private Vector sharedResource;

    public Producer(Vector sharedResource, String id) {
        super("Producer " + id);
        this.sharedResource = sharedResource;
    }

    public void run() {
        while (true) {
            synchronized (sharedResource) {
                String s = "value " + Math.random();
                sharedResource.addElement(s);
                System.out.println(this.getName() + " produced " + s);
                // Consumer aufwecken
                sharedResource.notify();
            }
            try {
                Thread.sleep((int) (100 * Math.random()));
            } catch (InterruptedException e) {
            }
        }
    }
}
