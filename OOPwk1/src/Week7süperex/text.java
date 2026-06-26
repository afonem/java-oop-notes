package Week7süperex;

public class text {
    public static void main(String[] args) {
        Circle c = new Circle(5.0, true);
        c.setColor("red");

        Rectangle r = new Rectangle(40, 6.0, "dark", false);

        System.out.println("circle");
        c.printInfo();

        System.out.println("rectangle");
        r.printInfo();
    
        
    }
}