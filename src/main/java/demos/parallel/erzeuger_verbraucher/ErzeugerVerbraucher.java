package demos.parallel.erzeuger_verbraucher;

import java.util.Vector;

public class ErzeugerVerbraucher {
    public static void main(String[] args) {
        Vector v = new Vector();
        Producer p = new Producer(v);
        Consumer c = new Consumer(v);
        p.start();
        c.start();
    }
}
