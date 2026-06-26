package INHERİTANCE;

public class Cat extends Animals {
	private boolean indoor;
	Cat(String name , int age,double weight,boolean indoor){
		this.indoor=indoor;
		super(name,age,weight);
	}
	public void makeSound() {
		System.out.println("miayaa");
		
	}
	public void purr() {
		System.out.println("mırıldıyor");
		
	}
	public void printInfo() {
		super.printInfo();
		System.out.println("ev kedisimi?" + indoor);
	
		
	}

}
