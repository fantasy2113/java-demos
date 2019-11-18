package demos.parallel.bankbetrieb;

public class Bank {
    private Konto[] konten;

    public Bank() {
        konten = new Konto[100];
        for (int i = 0; i < konten.length; i++) {
            konten[i] = new Konto();
        }
    }

    public synchronized void buchenSynchronized(int kontonr, float betrag) {
        buchen(betrag, konten[kontonr]);
    }

    public void buchenParallel(int kontonr, float betrag) {
        synchronized (konten[kontonr]) {
            buchen(betrag, konten[kontonr]);
        }
    }

    private void buchen(float betrag, Konto konto) {
        float alterStand = konto.abfragen();
        float neuerStand = alterStand + betrag;
        konto.setzen(neuerStand);
    }
}
