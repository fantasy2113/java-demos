package demos.parallel.erzeuger_verbraucher;

import java.util.Vector;

public class ErzeugerVerbraucher {
    public static void main(String[] args) {
        Vector vector = new Vector();
        Producer producer = new Producer(vector);
        Consumer consumer = new Consumer(vector);
        producer.start();
        consumer.start();
    }
}
