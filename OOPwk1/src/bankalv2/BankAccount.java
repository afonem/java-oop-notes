package bankalv2;

public class BankAccount {
	private String ownerName;
	private double balance;
	private String accountNumber;
	public BankAccount() {
		this.ownerName ="unknow";
		this.accountNumber="unknow";
		this.balance=000.00;
	}
	public BankAccount(String ownerName, double balance, String accountNumber) {
		
		this.ownerName = ownerName;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	public void deposit(double amount){
		this.balance+=amount;
		System.out.println("new Balance = "+this.balance);
	}
	public void withdraw(double amount) {
		this.balance-=amount;
		System.out.println("new Balance = "+ this.balance);
	}
	public void printInfo() {
		System.out.printf("name: %15s Balance : %.2f", this.ownerName ,this.balance);
	}
	

}
