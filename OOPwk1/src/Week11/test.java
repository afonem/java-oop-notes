package Week11;
import Week11.Clothing;
public class test {

    public static void main(String[] args) {

        Store<Electronics> electronicsStore = new Store<>();
        Store<Clothing> clothingStore = new Store<>();

        Electronics laptop = new Electronics(101, "Laptop", 1200.00, "Dell", 2);
        Electronics phone = new Electronics(102, "Smartphone", 800.00, "Samsung", 1);
        Clothing tshirt = new Clothing(201, "T-Shirt", 25.98, "M", "Cotton");
        Clothing jacket = new Clothing(202, "Jacket", 120.00, "L", "Leather");

        System.out.println("\n=== Applying Discounts ===");
        electronicsStore.applyDiscount(laptop, 20);
        electronicsStore.applyDiscount(phone, 10);
        clothingStore.applyDiscount(jacket, 15);

        System.out.println("=== Electronics Info ===");
        laptop.displayInfo();
        System.out.println("----------------------");
        phone.displayInfo();

        System.out.println("\n=== Clothing Info ===");
        tshirt.displayInfo();
        System.out.println("----------------------");
        jacket.displayInfo();
        System.out.println("----------------------");

        System.out.println("\n=== Discounted Price Preview ===");
        double tabletDiscounted = electronicsStore.getDiscountedPrice(laptop, 25);
        System.out.println("Tablet discounted price (25%): $" + tabletDiscounted);

        double hoodieDiscounted = clothingStore.getDiscountedPrice(jacket, 30);
        System.out.println("Hoodie discounted price (30%): $" + hoodieDiscounted);     
        
    }
}