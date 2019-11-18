package demos.parallel.producerConsumer;

import java.util.Vector;

public class Consumer extends Thread {
    private Vector sharedResource;

    public Consumer(Vector sharedResource, String id) {
        super("Consumer " + id);
        this.sharedResource = sharedResource;
    }

    public void run() {
        while (true) {
            synchronized (sharedResource) {
                if (sharedResource.size() < 1) {
                    try {
                        // Consumer wartet
                        System.out.println("\t" + this.getName() + " have to wait");
                        sharedResource.wait();
                    } catch (InterruptedException e) {
                    }
                }
                System.out.print("\t" + this.getName() + " got " + sharedResource.elementAt(0));
                sharedResource.removeElementAt(0);
                System.out.println(" (Remain: " + sharedResource.size() + ")");
            }
            try {
                Thread.sleep((int) (100 * Math.random()));
            } catch (InterruptedException e) {
            }
        }
    }
}
