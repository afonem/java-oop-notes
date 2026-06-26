package INHERİTANCE;

public class Bird extends Animals{
	private boolean canFly;
	Bird(String name ,int age,double weight,boolean canFly){
		super(name,age,weight);
		this.canFly=canFly;
	}
	public void makeSound() {
		System.out.println("cikcicick");
	}
	public void Fly() {
		if(canFly==true) {
			System.out.println("uçar");
		}
		else {
			System.out.println("uçamaz");
		}
		
	}
	public void printInfo() {
		super.printInfo();
		Fly();
	}

}
