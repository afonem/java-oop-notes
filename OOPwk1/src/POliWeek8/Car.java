package POliWeek8;

public class Car extends Vehicle{

	public Car(String brands, int speed) {
		super(brands, speed);
	}
	public void move() {
		super.move();
		System.out.println("this is a car");
	}

}
