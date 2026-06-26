package OTEL;

public class Otel {
	private String OtelAdı;
	private Misafir[] misafirler;
	private Oda[] odalar ;
	private int sayacMisafir=0;
	private int sayacOda=0;
	public Otel(String OtelAdı,int kapasite,int kapasiteMis) {
		this.odalar = new Oda[kapasite];
		this.OtelAdı=OtelAdı;
		this.misafirler= new Misafir[kapasiteMis];
	}
	public String getOtelAdı() {
		return OtelAdı;
	}
	public void setOtelAdı(String otelAdı) {
		OtelAdı = otelAdı;
	}
	public Misafir getMisafirler(int i) {
		return misafirler[i];
	}
	public void setMisafirler(Misafir[] misafirler) {
		this.misafirler = misafirler;
	}
	public Oda[] getOdalar() {
		return odalar;
	}
	public void setOdalar(Oda[] odalar) {
		this.odalar = odalar;
	}
	public int getSayacMisafir() {
		return sayacMisafir;
	}
	public void setSayacMisafir(int sayacMisafir) {
		this.sayacMisafir = sayacMisafir;
	}
	public int getSayacOda() {
		return sayacOda;
	}
	public void setSayacOda(int sayacOda) {
		this.sayacOda = sayacOda;
	}
	public void OdaEkle(Oda oda) {
		if(sayacOda<odalar.length) {
			this.odalar[sayacOda]=oda;
			sayacOda++;
		}
		else {
			System.out.println("odalar dolu");
		}
	}
	public void MisafirEkle(Misafir misafir) {
		if(sayacMisafir<misafirler.length) {
			this.misafirler[sayacMisafir]=misafir;
			sayacMisafir++;
			System.out.println("başarıyla misafir eklendi");
		}
		else {
			System.out.println("oda dolu");
		}
	}
	
	

}
