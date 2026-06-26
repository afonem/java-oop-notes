package Finalbis;

public class InPatient extends Patient implements ITreatable{
	private int daysStay;
	private double recoveryScore;

	public InPatient(int id, String name, double dailyRate, int daysStay, double recoveryScore) {
		super(id, name, dailyRate);
		this.daysStay = daysStay;
		this.recoveryScore = recoveryScore;
	}

	@Override
	public double calculateBill() {
		 double bill = dailyRate * daysStay;
	        if (daysStay > 5) {
	            bill = bill * 0.90;
	        }
	        return bill;
		
		
	}

	@Override
	public boolean isReadyForDischarge() {
		return recoveryScore >= 80 && daysStay >= 3;
		
		
	}

	@Override
	public void disPlayInfo() {
		System.out.println("ID       : " + id);
        System.out.println("Ad       : " + name);
        System.out.println("Fatura   : " + calculateBill());
        System.out.println("Taburcu  : " + isReadyForDischarge());
        System.out.println("-------------------");
		
	}
	

}
