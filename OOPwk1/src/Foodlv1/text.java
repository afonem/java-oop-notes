package Foodlv1;

public class text {

	public static void main(String[] args) {
		Pizza pizz = new Pizza();
		pizz.setName("Pizza");
		pizz.setCrustType("ince hamur");
		pizz.setVegeterian(true);
		Burger caj = new Burger();
		caj.setVegeterian(false);
		caj.setName("gaaf");
		caj.setPattyType("fafa");
		caj.printInfo();
		pizz.printInfo();
		
	

	}

}
/*=== Pizza 1 ===
Food Name: Margherita
Is Vegetarian: true
Crust Type: Thin

=== Pizza 2 ===
Food Name: Pepperoni
Is Vegetarian: false
Crust Type: Thick

=== Burger 1 ===
Food Name: Cheeseburger
Is Vegetarian: false
Patty Type: Beef

=== Burger 2 ===
Food Name: Veggie Burger
Is Vegetarian: true
Patty Type: Plant-Based*/