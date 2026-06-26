package FinalZorBHYS;

public class LoanAccount extends Account implements ITransferable{
	public LoanAccount(int id, String owner, double debtLimit,double monthlyRate) {
		super(id, owner, 0);
		this.debtLimit = debtLimit;
		this.monthlyRate=monthlyRate;
		
	}

	private double debtLimit;
	
	private double monthlyRate; 

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
		if(balance <0) {
			if((-balance+miktar)>debtLimit) {
				System.out.println("toplam borç =  "+ (miktar -balance));
				
			}
			else {System.out.println("kartpatlak");
			}
			}
		else {
			if (balance - miktar <0) {
			System.out.println("kullanılabiilir limit =  " +(debtLimit +(balance - miktar)));
			}
			else {
				System.out.println("kullanılabiilir limit =  " +(debtLimit -(balance - miktar)));
			}
		}
		
		
		
		
	}

	@Override
	public void displayInfo() {
		System.out.println("bomsb");
		
	}

}
