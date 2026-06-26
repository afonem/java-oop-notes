package Finalcomparea;

public abstract class Book{
	protected int id;
	protected String title;
	protected double price;
	public Book(int id, String title, double price) {
		
		this.id = id;
		this.title = title;
		this.price = price;
	}
	public abstract void displayInfo();
	public void applyDiscount(double oran) {
		this.price -=price*oran;
		System.out.println("new price =  "+ this.price);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
