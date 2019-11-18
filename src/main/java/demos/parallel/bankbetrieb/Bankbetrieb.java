package demos.parallel.bankbetrieb;

public class Bankbetrieb {
    public static void main(String[] args) {
        Bank sparkasse = new Bank();
        BankAngestellte andreaMuller = new BankAngestellte("Andrea Müller", sparkasse);
        BankAngestellte petraSchmitt = new BankAngestellte("Petra Schmitt", sparkasse);
    }
}
