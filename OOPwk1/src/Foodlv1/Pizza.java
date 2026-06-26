package Foodlv1;

public class Pizza extends Food {
	/*Metodlar:

Parametresiz constructor
Parametreli constructor (name, isVegetarian, crustType) → super kullan!
Getter & Setter
//printInfo() → override et, super.printInfo() çağır + crustType'ı yazdır*/
	private String crustType;
	public Pizza (String name ,boolean isVegetarian,String crustType) {
		super(name,isVegetarian);
		this.crustType="crusType";
	}
	public Pizza () {
		super();
		this.crustType="unknow";
		
	}
	public void printInfo() {
		super.printInfo();
		System.out.println("pizza type is "+ this.crustType);
		
	}
	public String getCrustType() {
		return crustType;
	}
	public void setCrustType(String crustType) {
		this.crustType = crustType;
	}

}
