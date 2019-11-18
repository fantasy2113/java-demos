package demos.parallel.bankcompany;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
        for (int nr = 0; nr < 100000; nr++) {
            accounts.add(new Account(nr));
        }
    }

    public synchronized void bookSynchronized(int accountNr, float amount) {
        book(amount, getAccount(accountNr));
    }

    public void bookParallel(int accountNr, float amount) {
        Account account = getAccount(accountNr);
        synchronized (account) {
            book(amount, account);
        }
    }

    private Account getAccount(int accountNr) {
        return accounts.stream()
                .filter(a -> a.getNr() == accountNr)
                .findAny()
                .orElse(null);
    }

    private void book(float amount, Account account) {
        account.setBalance(account.getBalance() + amount);
    }
}
