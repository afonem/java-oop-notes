package POliWeek8;

public class Bike extends Vehicle{

	public Bike(String brands, int speed) {
		super(brands, speed);
	}

	@Override
	public void move() {
		
		super.move();
		System.out.println("this is a bike");
	}
	

}
