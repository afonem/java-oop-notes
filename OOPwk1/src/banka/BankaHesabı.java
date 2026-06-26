package banka;

public class BankaHesabı {
	private String HesapNo;
	private double Bakiye;
	BankaHesabı(String HesapNo, double Bakiye){
		this.Bakiye=Bakiye;
		this.HesapNo=HesapNo;
	}
	public String getHesapNo() {
		return HesapNo;
	}
	public void setHesapNo(String hesapNo) {
		HesapNo = hesapNo;
	}
	public double getBakiye() {
		return Bakiye;
	}
	public void setBakiye(double bakiye) {
		Bakiye = bakiye;
	}
	public double paraYatır(String HesapNo,Double yatır) {
		this.Bakiye+=yatır;
		return this.Bakiye;
	}
	public double paraÇek(String HesapNo,Double çek) {
		if(Bakiye <çek) {
			System.out.println("yetersiz bakiye");
		}
		else {
			this.Bakiye-=çek;
		}
		return this.Bakiye; 
		
		
		
		
		
		
		
		
		
	}

}
