package demos.parallel.bankcompany;

public class Bank {
    private Account[] accounts;

    public Bank() {
        accounts = new Account[100];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
        }
    }

    public synchronized void bookSynchronized(int accountNr, float amount) {
        book(amount, accounts[accountNr]);
    }

    public void bookParallel(int accountNr, float amount) {
        synchronized (accounts[accountNr]) {
            book(amount, accounts[accountNr]);
        }
    }

    private void book(float amount, Account account) {
        account.setBalance(account.getBalance() + amount);
    }
}
