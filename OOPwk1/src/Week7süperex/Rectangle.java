package Week7süperex;

public class Rectangle extends GeometricObject {
    double width;
    double height;

    Rectangle() {
        super("white", false);
        width = 1.0;
        height = 1.0;
    }

    Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("width: " + width);
        System.out.println("height: " + height);
    }
}