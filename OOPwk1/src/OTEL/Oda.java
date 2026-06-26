package OTEL;

public class Oda {
	private String OdaNo;
	private int kapasite;
	private double fiyat;
	private boolean kontrol;
	
	public Oda(String OdaNo,int kapasite,double fiyat) {
		this.fiyat=fiyat;
		this.kapasite=kapasite;
		this.OdaNo=OdaNo;
	}
	public String getOdaNo() {
		return OdaNo;
	}
	public void setOdaNo(String odaNo) {
		OdaNo = odaNo;
	}
	public int getKapasite() {
		return kapasite;
	}
	public void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public boolean isKontrol() {
		return kontrol;
	}
	public void setKontrol(boolean kontrol) {
		this.kontrol = kontrol;
	}
	public void setDolu(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
