package INHERİTANCE;

public abstract class text {

	public static void main(String[] args) {
		Animals[] animal= new Animals[3];
	     animal[0]= new Cat("Tom",3,4.5,true);
	     animal[1]= new Dog("Ak",4,20.0,"akbaş");
	     animal[2]= new Bird("tw",1,0.2,true);
	     for(Animals a: animal) {
	    	 a.makeSound();
	    	 
	     }
	     ((Cat)(animal[0])).purr();
	     Dog dog = ((Dog)(animal[1]));
	     dog.fetch();
	     ((Bird)(animal[2])).Fly();
	     for(Animals a:animal) {
	    	 a.printInfo();
	     }

	}

}
