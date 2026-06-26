package TryCatch1;

public class Hesaplama {
	public double bol(double a , double b) throws SıfıraBölmeException
	{
		if(b==0) {
			throw new SıfıraBölmeException(); 
		}
		else {
			return a/b;
		}
	}
}
