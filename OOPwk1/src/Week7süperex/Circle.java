package Week7süperex;

public class Circle extends GeometricObject {
    double radius;

    Circle() {
        super("white", false);
        radius = 1.0;
    }

    Circle(double radius) {
        super("white", false);
        this.radius = radius;
    }

    Circle(double radius, boolean filled) {
        super("white", filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("radius: " + radius);
    }
}