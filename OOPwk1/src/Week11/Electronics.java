package Week11;

public class Electronics extends Product {

    private String brand;
    private int warrantyYears;

    public Electronics(int id, String name, double price, String brand, int warrantyYears) {
        super(id, name, price);
        this.brand = brand;
        this.warrantyYears = warrantyYears;
    }

    //Since Product's fields are protected, we'll use the field directly. No getter is needed.
    @Override
    public void displayInfo() {
        System.out.println("Electronics ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warrantyYears + " year(s)");
    }
}