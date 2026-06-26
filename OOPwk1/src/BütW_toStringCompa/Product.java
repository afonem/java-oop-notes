package BütW_toStringCompa;

public abstract class Product implements Comparable<Product>,Cloneable{
	protected String name;
    protected double price;
    protected int stock;
	public Product(String name, double price, int stock) {
		
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public int compareTo(Product other) {
		int a = Double.compare(this.price, other.price);
		if(a==0) {
			System.out.println("eşit");
			return Double.compare(this.stock, other.stock);
			
		}
		if(a==-1) {
			System.out.println(other.name +" >" +this.name);
			
		}
		if(a==1) {
			System.out.println(other.name+"   "+ other.price +" <"  +this.price +"  "+this.name);
			
		}
		return a;
	}
	public Product clone() {
		try {
			return (Product) super.clone();
		}
		catch(CloneNotSupportedException e) {
			System.out.println("kopyalma başarısız");
			return null;
		}
		
	}
	public String toString() {
		return "name =  " + name +"   price =   " + price + "  stock       ====  " + stock;
	}

}
