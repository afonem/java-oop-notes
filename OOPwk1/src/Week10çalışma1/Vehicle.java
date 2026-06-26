package Week10çalışma1;

public abstract class Vehicle {
	private int id;
	private String brand;
	protected boolean isRented;
	public Vehicle(int id, String brand) {
		this.isRented=true;
		this.id = id;
		this.brand = brand;
	}
	public abstract String getInfo();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isRented() {
		return isRented;
	}
	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}
	
	

}
