package BütW_Exception;

public abstract class BankAccount {
	private int id;
	private String owner;
	protected double balance;
	public abstract void withdraw(double amount) throws InsufficientFundsException;
	public abstract void displayInfo();
	public void deposit(double deposit) {
		
	}
	public BankAccount(int id, String owner, double balance) {
	
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
		
	

}
