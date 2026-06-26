package BütW_Exception;

public interface Transferable {
	

	void transfer(BankAccount source, BankAccount target, double amount) throws InsufficientFundsException;

}
