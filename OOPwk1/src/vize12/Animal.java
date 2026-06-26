package vize12;

public class Animal {
	private String name ;
	
	private double Speed;

	public Animal(String name, double speed) {
		
		this.name = name;
		Speed = speed;
	}
	public void move() {
		System.out.println(name +"  ");
	}
	public String toString() {
		return name + "  "+ Speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return Speed;
	}
	public void setSpeed(double speed) {
		Speed = speed;
	}
	

}
