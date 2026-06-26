package vize12;

public class Dog extends Animal{
	private int stamina;

	public Dog(String name, double speed, int stamina) {
		super(name, speed);
		this.stamina = stamina;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		if(this.stamina<3) {
			System.out.println("horse so tired , he cant run");
		}
		else {
			System.out.println("energy = " + this.stamina);
			this.stamina-=3;
		}
	}

	@Override
	public String toString() {
		
		return super.toString() + this.stamina;
	}

	
	

}
