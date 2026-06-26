package ZZFor_metZZ;

public class main {

	public static void main(String[] args) {
	    int[] dizi1 = {5, 2, 7, 9, 3};
	    System.out.println("Orijinal Dizi 1: [5, 2, 7, 9, 3]");
	    
	    // ÇÖZÜM: Başına ZirveNoktası. ekledik ve sonunu 'Kaydır' yaptık!
	    ZirveNoktası.zirveleriKaydır(dizi1); 
	    
	    System.out.println("Metot Sonrası 1: " + java.util.Arrays.toString(dizi1));

	    System.out.println("-----------------------------------------");

	    int[] dizi2 = {9, 2, 8, 4, 5};
	    System.out.println("Orijinal Dizi 2: [9, 2, 8, 4, 5]");
	    
	    // Aynı şekilde burayı da düzelttik
	    ZirveNoktası.zirveleriKaydır(dizi2);
	    
	    System.out.println("Metot Sonrası 2: " + java.util.Arrays.toString(dizi2));
	}}


