package OTEL;

public class testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Otel ASS = new Otel("ASS",2,2);
		Oda k112 = new Oda("k112",4,4500.60);
		Oda z125= new Oda("z125",2,2500.0);
		Oda kk789=new Oda("kk789",2,2500000);
		Misafir m112 = new Misafir("bad","f");
		Misafir m113 = new Misafir("bad","f");
		Misafir m114 = new Misafir("bad","f");
		ASS.OdaEkle(k112);
		ASS.OdaEkle(kk789);
		ASS.OdaEkle(z125);
		ASS.MisafirEkle(m114);
		ASS.MisafirEkle(m113);
		ASS.MisafirEkle(m112);
		 System.out.println(ASS.getMisafirler(1).getIsim());
		
		

	}

}
