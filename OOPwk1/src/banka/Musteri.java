package banka;

public class Musteri {
	private String ad ;
	private BankaHesabı Hesap ;
	Musteri(String ad,BankaHesabı hesap){
		this.ad=ad;
		this.Hesap=hesap;
		
	}
	public String getad() {
		return ad;
	}
	public void setad(String ad) {
		this.ad = ad;
	}
	public BankaHesabı getHesap() {
		return Hesap;
	}
	public void setHesap(BankaHesabı hesap) {
		this.Hesap = hesap;
	}
	

}
