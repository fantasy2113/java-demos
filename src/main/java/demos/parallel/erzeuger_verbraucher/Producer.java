package demos.parallel.erzeuger_verbraucher;

import java.util.Vector;

public class Producer extends Thread {
    private Vector v;

    public Producer(Vector v) {
        this.v = v;
    }

    public void run() {
        String s;
        while (true) {
            synchronized (v) {
                s = "Wert " + Math.random();
                v.addElement(s);
                System.out.println("Produzent erzeugte " + s);
                // Consumer aufwecken
                v.notify();
            }
            try {
                Thread.sleep((int) (100 * Math.random()));
            } catch (InterruptedException e) {
            }
        }
    }
}
