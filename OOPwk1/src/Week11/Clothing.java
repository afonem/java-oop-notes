package Week11;

public class Clothing extends Product {

    private String size;
    private String material;

    public Clothing(int id, String name, double price, String size, String material) {
        super(id, name, price);
        this.size = size;
        this.material = material;
        
    }

    //Since Product's fields are protected, we'll use the field directly. No getter is needed.
    @Override
    public void displayInfo() {
        System.out.println("Clothing ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}