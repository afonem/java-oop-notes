package vize12;

public class Horse extends Animal {
	private double energy;

	public Horse(String name, double speed, double energy) {
		super(name, speed);
		this.energy = energy;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		if(energy<10) {
			System.out.println("horse so tired , he cant run");
		}
		else {
			System.out.println("energy = " + this.energy);
			this.energy-=10;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + this.energy;
	}
	

}
