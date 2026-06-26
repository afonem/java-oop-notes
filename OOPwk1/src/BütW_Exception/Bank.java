package BütW_Exception;

import java.util.ArrayList;

public class Bank implements Transferable{
	private ArrayList<BankAccount> accounts;
	

	public Bank() {
		
		this.accounts= new ArrayList<>();
	}
	public void addAccount(BankAccount acc) throws DuplicateAccountException {
	    for (BankAccount a : accounts) {
	        if (a.getId() == acc.getId()) {
	            throw new DuplicateAccountException("Bu ID zaten mevcut: " + acc.getId());
	        }
	    }
	    accounts.add(acc);
	}
	public void removeAccount(int id) {
		
	}
	public BankAccount findAccount(int id) throws AccountNotFoundException  {
		for(BankAccount a : accounts) {
			if( id == a.getId()) {
				return a;
			}
			
			
		}
		 throw new AccountNotFoundException("id not found , id =  " + id);
		
	}
	


	@Override
	public void transfer(BankAccount source,BankAccount target, double amount) throws InsufficientFundsException  {
		if(amount > source.getBalance()) {
			throw new InsufficientFundsException("Insufficient Balance ");
		}
		else {
			source.setBalance(source.getBalance()-amount);
			target.setBalance(target.getBalance()+amount);
			System.out.println("Transaction successful");
		}
		
		
	}

}
