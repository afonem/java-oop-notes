package banka;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banka ASS = new Banka(3);
		BankaHesabı TR766 = new BankaHesabı("TR766",1000000000.60);
		Musteri TR766ali = new Musteri("Ali Ok",TR766);
		BankaHesabı TR767 = new BankaHesabı("TR766",785000.60);
		Musteri TR767veli = new Musteri("veli Ok",TR767);
		BankaHesabı TR768 = new BankaHesabı("TR766",1550000000.60);
		Musteri TR768ayşe= new Musteri("ayşe Ok",TR768);
		 ASS.MusteriEkle(TR766ali);
		 ASS.MusteriEkle(TR767veli);
		 ASS.MusteriEkle(TR768ayşe);
		 System.out.println(ASS.getMusteri(2).getHesap().getBakiye());
		 ASS.liste();
		 
		 BankaHesabı TR7869 = new BankaHesabı("TR7869",154625);
		 Musteri TR7869velibk = new Musteri("veli bk",TR7869);
		 ASS.MusteriEkle(TR7869velibk);

	}

}
