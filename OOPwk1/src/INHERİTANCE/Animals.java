package INHERİTANCE;

public abstract class Animals {
	private String name;
	private int age;
	private double weight;
	public Animals(String name, int age, double weight) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	 public abstract void makeSound(); 
	 public void eat() {
		 System.out.println(this.name + "eating");
	 }
	 public void printInfo() {
		 System.out.println("Anımal:" + this.name);
		 System.out.println("Anımal: age:  "+ this.age);
		 System.out.println("Anımal: weight  ;" + this.weight);
	 }
	
		
	

}
