package Foodlv1;

public class Food {
	private String name;
	
	private boolean isVegeterian;
	public Food() {
		this.isVegeterian=true;
		this.name="unknow";
	
	}
	public Food(String name,boolean isVegeterian) {
		this.isVegeterian=isVegeterian;
		this.name=name;
	}
	public void printInfo() {
		System.out.println(this.name +"is vegeterian =" + this.isVegeterian);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVegeterian() {
		return isVegeterian;
	}
	public void setVegeterian(boolean isVegeterian) {
		this.isVegeterian = isVegeterian;
	}
	

}
