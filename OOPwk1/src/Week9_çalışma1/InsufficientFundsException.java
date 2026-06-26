package Week9_çalışma1;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException (double miktar){
		super("yetersiz bakiye " + miktar + " tl yok ");
	}

}
