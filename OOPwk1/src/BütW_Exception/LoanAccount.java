package BütW_Exception;

public class LoanAccount extends BankAccount {
	private double creditLimit;

	public LoanAccount(int id, String owner, double balance,double creditLimit) {
		super(id, owner, balance);
		this.creditLimit=creditLimit;
	}

	@Override
	public void withdraw(double amount)throws InsufficientFundsException {
		if(balance - amount < -creditLimit) {
			throw new InsufficientFundsException("transsaction failed");
			
		}
		else {
			this.balance= balance - amount;
			System.out.println("new balance =  " + this.balance);
		}
		
		
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}
	
	

}
