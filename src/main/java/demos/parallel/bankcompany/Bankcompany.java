package demos.parallel.bankcompany;

public class Bankcompany {
    public static void main(String[] args) {
        Bank sparkasse = new Bank();
        Employee andreaMuller = new Employee("Andrea Müller", sparkasse);
        Employee petraSchmitt = new Employee("Petra Schmitt", sparkasse);
    }
}
