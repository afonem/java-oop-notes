package INHERİTANCE;

public class Dog  extends Animals {
	private String breed;

	public Dog(String name, int age, double weight,String breed) {
		super(name, age, weight);
		this.breed=breed;
	}

	
	public void makeSound() {
		System.out.println("haaavahvaaav");
		
		
	}
	public void fetch() {
		System.out.println("topu getiriyor");
		
	}
	public void printInfo() {
		System.out.println("Breed  "+ this.breed );
		super.printInfo();
	}

}
