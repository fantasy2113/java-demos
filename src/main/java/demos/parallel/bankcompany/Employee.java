package demos.parallel.bankcompany;

public class Employee extends Thread {
    private Bank bank;

    public Employee(String name, Bank bank) {
        super(name);
        this.bank = bank;
        start();
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            // Kontonummer einlesen;
            // simuliert durch Wahl einer Zufallszahl zwischen 0 und 99
            int accountNr = (int) (Math.random() * 1000);
            // Überweisungsbetrag einlesen;
            // simuliert durch Wahl einer Zufallszahl
            // zwischen -500 und +499
            float amount = (int) (Math.random() * 1000) - 500;
            bank.bookSynchronized(accountNr, amount);
            System.out.println("Booking: " + this.getName() + " - Account-Nr.: " + accountNr + " - Amount: " + amount);
        }
    }
}
