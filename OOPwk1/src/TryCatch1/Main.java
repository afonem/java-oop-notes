package TryCatch1;

public class Main {

	public static void main(String[] args) {
		Hesaplama a = new Hesaplama();
		try {
		System.out.println(a.bol(45, 5));
		System.out.println(a.bol(45, 1));
		System.out.println(a.bol(45, 0));
		System.out.println(a.bol(45, 2));
		} catch(SıfıraBölmeException e){
			System.out.println(e.getMessage());
			
			
		}

	}

}
