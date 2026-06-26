package banka;

public class Banka {
	private int sayac;
	private Musteri[] musteriler;
	public Banka(int kapasite) {
		this.sayac=0;
		this.musteriler = new Musteri[kapasite];
	}
	public void MusteriEkle(Musteri yeniMusteri) {
	    if (sayac >= musteriler.length) {  // > değil >= olmalı
	        System.out.println("Kapasite dolu");
	    } else {
	        musteriler[sayac] = yeniMusteri;  // ← DİZİYE KAYDET
	        sayac++;
	        System.out.println("Başarıyla eklendi " + sayac + ". müşteri");
	    }
	}
	public int getSayac() {
		return sayac;
	}
	public void setSayac(int sayac) {
		this.sayac = sayac;
	}
	public Musteri getMusteri(int i) {
	    return musteriler[i];  // ← null değil, diziyi döndür
	}
	public void setMusteriler(Musteri[] musteriler) {
		this.musteriler = musteriler;
	}
	public void isimleAra(String ad) {
		for(int i =0;i<sayac;i++) {
			if(musteriler[i].getad().equals(ad)) {
				System.out.println( " bakiye"+musteriler[i].getHesap().getBakiye()+"  hesapNO"+musteriler[i].getHesap().getHesapNo());
				
			}
			else {
				System.out.println("kişi bulunamadı");
			}
		}
	}
	public void liste() {
		for(int i=0;i<musteriler.length;i++) {
			System.out.println(musteriler[i].getHesap().getHesapNo() + "isim = "+musteriler[i].getad() + " bakiye"+musteriler[i].getHesap().getBakiye());
		}
	}

}
