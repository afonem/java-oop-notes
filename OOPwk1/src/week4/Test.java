package week4;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter bank name: ");
        String bankName = scanner.nextLine();
        Bank bank = new Bank(bankName);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter customer " + i + " name: ");
            String customerName = scanner.nextLine();
            bank.createCustomer(customerName);
            Customer customer = bank.getCustomer(customerName);

            for (int j = 1; j <= 2; j++) {
                System.out.print("Enter account number for " + customerName + " account " + j + ": ");
                String accountNumber = scanner.nextLine();
                customer.openAccount(accountNumber, 0);
            }
        }

        for (int i = 0; i < bank.getNumCustomers(); i++) {
            Customer customer = bank.getCustomers()[i];
            for (int j = 0; j < customer.getNumAccounts(); j++) {
                double amount = 100 + random.nextInt(901);
                customer.getAccounts()[j].deposit(amount);
            }
        }

        System.out.println("\nAll Customers:");
        bank.listCustomers();

        System.out.println("\nAll Accounts:");
        bank.listAccounts();

        System.out.print("\nEnter an account number to search: ");
        String searchAccountNumber = scanner.nextLine();
        Account foundAccount = bank.getAccount(searchAccountNumber);

        if (foundAccount != null) {
            System.out.println("Account found: " + foundAccount.getAccountNumber() + " Balance: " + foundAccount.getBalance());
        } else {
            System.out.println("Account not found.");
        }

        System.out.print("\nEnter source account number: ");
        String src = scanner.nextLine();
        System.out.print("Enter target account number: ");
        String target = scanner.nextLine();
        System.out.print("Amount: ");
        double amt = scanner.nextDouble();

        bank.transferMoney(src, target, amt);
        bank.listAccounts();

        scanner.close();
    }
}