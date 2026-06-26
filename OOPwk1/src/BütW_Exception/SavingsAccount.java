package BütW_Exception;

public class SavingsAccount extends BankAccount {
	private double interestRate;

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(balance<amount) {
			throw new InsufficientFundsException("value of amount cannot be greater balance ");
		}
		
		
	}

	@Override
	public void displayInfo() {
		System.out.println("interest rate = " + interestRate);
		
	}

	public SavingsAccount(int id, String owner, double balance, double interestRate) {
		super(id, owner, balance);
		this.interestRate=interestRate;
	}
	

}
