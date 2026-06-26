package Week9_çalışma1;

public class BankaHesabı {
	private double bakiye;
	
	public BankaHesabı(double bakiye) {
		this.bakiye=bakiye;
	}
	public void paraCek(double miktar) throws InsufficientFundsException{
		if(miktar > bakiye) {
			throw new InsufficientFundsException(miktar);
		}
		else {
			bakiye-=miktar;
			System.out.println(miktar + " tl çekildi kalan   " + bakiye);
		}
		
	}

}
