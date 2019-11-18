package demos.parallel.bankcompany;

public class Account {
    private final int nr;
    private float balance;

    public Account(int nr) {
        this.nr = nr;
        this.balance = 0;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float amount) {
        balance += amount;
    }

    public int getNr() {
        return nr;
    }
}
