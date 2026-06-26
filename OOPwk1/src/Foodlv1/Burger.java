package Foodlv1;

public class Burger extends Food{
	/*pattyType (String) ← beef, chicken, plant-based vs.

Metodlar:

Parametresiz constructor
Parametreli constructor (name, isVegetarian, pattyType) → super kullan!
Getter & Setter
printInfo() → override et, super.printInfo() çağır + pattyType'ı yazdır*/
	private String pattyType;

	public Burger() {
		super();
		this.pattyType="unknow";
	}

	public Burger(String name ,boolean isVegetarian ,String pattyType) {
		super(name,isVegetarian);
		this.pattyType = pattyType;
	}

	@Override
	public void printInfo() {
		System.out.println("Type of burger is "+ this.pattyType);
		super.printInfo();
	}

	public String getPattyType() {
		return pattyType;
	}

	public void setPattyType(String pattyType) {
		this.pattyType = pattyType;
	}
	

}
