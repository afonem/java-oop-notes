package BütW_toStringCompa;

public class Electronics extends Product implements Cloneable {
	 public Electronics(String name, double price, int stock,String brand, int warrantyMonths) {
		super(name, price, stock);
		this.brand=brand;
		this.warrantyMonths=warrantyMonths;
		
	}
	 private String brand;
	    private int warrantyMonths;
		
	    public Electronics clone() {
			try {
				return (Electronics) super.clone();
			}
			catch(RuntimeException e) {
				System.out.println("cıkkk");
				return null;
			}
		}
		public String toString() {
			return "warrantyMonths =****** " + this.warrantyMonths;  
		}

}
