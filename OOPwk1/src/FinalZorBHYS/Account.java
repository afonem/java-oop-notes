package FinalZorBHYS;

public  abstract class Account {
	protected int id;
	protected String owner;
	protected double balance;
	public Account(int id, String owner, double initialBalance) {
		super();
		this.id = id;
		this.owner = owner;
		this.balance = initialBalance >= 0 ? initialBalance:0;
	}
	public void deposit(double miktar) {
		if(miktar>0) {
			 balance = balance +miktar;
			 System.out.println("yeni miktar");
		}
		else {
			
			System.out.println("hata yatırım 0 yada negatif olamaz");
		}
		
	}
	public abstract void withdraw(double miktar);
	public abstract void displayInfo();
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
