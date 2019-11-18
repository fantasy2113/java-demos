package demos.parallel.bankbetrieb;

public class BankAngestellte extends Thread {
    private Bank bank;

    public BankAngestellte(String name, Bank bank) {
        super(name);
        this.bank = bank;
        start();
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            // Kontonummer einlesen;
            // simuliert durch Wahl einer Zufallszahl zwischen 0 und 99
            int kontonr = (int) (Math.random() * 100);
            // Überweisungsbetrag einlesen;
            // simuliert durch Wahl einer Zufallszahl
            // zwischen -500 und +499
            float betrag = (int) (Math.random() * 1000) - 500;
            bank.buchenParallel(kontonr, betrag);
            System.out.println("Buchung: " + this.getName() + " - KontoNr: " + kontonr + " - Betrag: " + betrag);
        }
    }
}
