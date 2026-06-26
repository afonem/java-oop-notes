package POliWeek8;

public class Bus extends Vehicle {

	public Bus(String brands, int speed) {
		super(brands, speed);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		System.out.println("this is a bus");
	}
	

}
