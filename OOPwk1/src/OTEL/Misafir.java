package OTEL;

public class Misafir {
	private String isim ;
	private String soyisim;
	private Oda oda;
	public Oda getOda() {
		return oda;
	}
	public Misafir (String isim,String soyisim) {
		this.isim=isim;
		this.soyisim=soyisim;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public void setOda(Oda oda) {
		this.oda=oda;
		
		
	}

}
