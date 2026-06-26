package week4;

public class Bank {
    private String name;
    private Customer[] customers;
    private int numCustomers;

    public Bank(String name) {
        this.name = name;
        this.customers = new Customer[100];
        this.numCustomers = 0;
    }

    public String getName() {
        return name;
    }

    public void createCustomer(String name) {
        if (numCustomers < 100) {
            customers[numCustomers] = new Customer(name);
            numCustomers++;
        }
    }

    public void listCustomers() {
        for (int i = 0; i < numCustomers; i++) {
            System.out.println(customers[i].getName());
        }
    }

    public void listAccounts() {
        for (int i = 0; i < numCustomers; i++) {
            Customer customer = customers[i];
            for (int j = 0; j < customer.getNumAccounts(); j++) {
                System.out.println(customer.getName() + " " +
                        customer.getAccounts()[j].getAccountNumber() + " " +
                        customer.getAccounts()[j].getBalance());
            }
        }
    }

    public Customer getCustomer(String name) {
        for (int i = 0; i < numCustomers; i++) {
            if (customers[i].getName().equals(name)) {
                return customers[i];
            }
        }
        return null;
    }

    public Account getAccount(String accountNumber) {
        for (int i = 0; i < numCustomers; i++) {
            Account account = customers[i].getAccount(accountNumber);
            if (account != null) {
                return account;
            }
        }
        return null;
    }

    public void transferMoney(String accountNumber1, String accountNumber2, double amount) {
        Account account1 = getAccount(accountNumber1);
        Account account2 = getAccount(accountNumber2);
        if (account1 != null && account2 != null) {
            if (amount <= account1.getBalance()) {
                account1.withdraw(amount);
                account2.deposit(amount);
            }
        }
    }

    public int getNumCustomers() {
        return numCustomers;
    }

    public Customer[] getCustomers() {
        return customers;
    }
}