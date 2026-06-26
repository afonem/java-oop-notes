package BütW_Exception;

public class main {

	public static void main(String[] args) {
	    Bank bank = new Bank();

	    try {
	        bank.addAccount(new SavingsAccount(1, "Ali", 1000, 0.05));
	        bank.addAccount(new SavingsAccount(2, "Ayşe", 500, 0.03));
	        bank.addAccount(new LoanAccount(3, "Mehmet", 200, 2000));

	        // Aynı ID → DuplicateAccountException
	        bank.addAccount(new SavingsAccount(1, "Veli", 300, 0.02));

	    } catch (DuplicateAccountException e) {
	        System.out.println("Hata: " + e.getMessage());
	    }

	    try {
	        BankAccount ali = bank.findAccount(1);
	        BankAccount ayse = bank.findAccount(2);

	        // Transfer
	        bank.transfer(ali, ayse, 300);

	        // Yetersiz bakiye → InsufficientFundsException
	        bank.transfer(ali, ayse, 9999);

	    } catch (AccountNotFoundException e) {
	        System.out.println("Hata: " + e.getMessage());
	    } catch (InsufficientFundsException e) {
	        System.out.println("Hata: " + e.getMessage());
	    }

	    try {
	        // Olmayan hesap → AccountNotFoundException
	        bank.findAccount(99);

	    } catch (AccountNotFoundException e) {
	        System.out.println("Hata: " + e.getMessage());
	    }
	}}