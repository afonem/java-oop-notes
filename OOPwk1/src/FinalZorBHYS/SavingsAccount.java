package FinalZorBHYS;

public class SavingsAccount extends Account implements ITransferable {
private double interestRate;



public SavingsAccount(int id, String owner, double initialBalance,double interestRate) {
	super(id, owner, initialBalance);
	this.interestRate= interestRate;
}

@Override
public void transfer(Account hedef, double miktar) {
	if (miktar<this.balance) {
	this.withdraw(miktar);
	hedef.deposit(miktar);
	System.out.println("para aktarıldı");
	}
	else {
		System.out.println("parayok");
	
}
}

@Override
public void withdraw(double miktar) {
	if(miktar<balance && miktar>0) {
		balance-=miktar;
		System.out.println("kalan miktar"+balance);
		
	}
	else {
		System.out.println("hata geçersiz miktar " );
	}
	
}

@Override
public void displayInfo() {
	System.out.println("fasd");
	
}
public void applyInterest() {
	balance += balance*interestRate;
	System.out.println("faiziiii"+balance);
}

	
}

