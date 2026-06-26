package POliWeek8;

public class Vehicle {
	private String brands;
	private int speed;
	public Vehicle(String brands, int speed) {
		
		this.brands = brands;
		this.speed = speed;
	}
	public String getBrands() {
		return brands;
	}
	public void setBrands(String brands) {
		this.brands = brands;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void showInfo() {
		System.out.println("this vehicle brand is a " + this.brands +"this vehicle topspeed is a  "+this.speed);
	}
	public void move() {
		System.out.println(this.brands + "speed "+ this.speed);
	}
	

}
