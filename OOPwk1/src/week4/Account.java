package week4;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double depositMoney) {
        balance += depositMoney;
    }

    public void withdraw(double withdrawMoney) {
        if (withdrawMoney <= balance) {
            balance -= withdrawMoney;
        }
    }
}