package Week9_çalışma1;

public class mainclass {

	public static void main(String[] args) {
		BankaHesabı bk = new BankaHesabı(10000);
		try {
			bk.paraCek(9900);
			bk.paraCek(200);
			bk.paraCek(0);
			
		}
		catch(InsufficientFundsException e) {
			 System.out.println(e.getMessage());
		}


	}

}
