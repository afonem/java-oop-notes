package week4;

public class Customer {
    private String name;
    private Account[] accounts;
    private int numAccounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new Account[10];
        this.numAccounts = 0;
    }

    public String getName() {
        return name;
    }

    public void openAccount(String accountNumber, double balance) {
        if (numAccounts < 10) {
            accounts[numAccounts] = new Account(accountNumber, balance);
            numAccounts++;
        }
    }

    public Account getAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public Account[] getAccounts() {
        return accounts;
    }
}