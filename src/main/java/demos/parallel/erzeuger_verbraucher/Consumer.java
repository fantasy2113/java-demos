package demos.parallel.erzeuger_verbraucher;

import java.util.Vector;

public class Consumer extends Thread {
    private Vector v;

    public Consumer(Vector v) {
        this.v = v;
    }

    public void run() {
        while (true) {
            synchronized (v) {
                if (v.size() < 1) {
                    try {
                        // Consumer wartet
                        v.wait();
                    } catch (InterruptedException e) {
                    }
                }
                System.out.print(" Konsument fand "
                        + v.elementAt(0));
                v.removeElementAt(0);
                System.out.println("(verbleiben: " + v.size() + ")");
            }
            try {
                Thread.sleep((int) (100 * Math.random()));
            } catch (InterruptedException e) {
            }
        }
    }
}
