package BütW_toStringCompa;

public class Food extends Product{
	public Food(String name, double price, int stock,String expiryDate) {
		super(name, price, stock);
		this.expiryDate=expiryDate;
	}
	private String expiryDate;
    private boolean isOrganic;
	public Food clone() {
		try {
			return (Food) super.clone();
			
		}
		catch(RuntimeException e) {
			System.out.println("cıkk");
			return null;
		}
	}
	public String toString() {
		return this.name + "   " + this.isOrganic;
	}

		
	
	
	
    
	
	

}
