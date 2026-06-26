package Week7süperex;

public class GeometricObject {
    String color;
    boolean filled;

    GeometricObject() {
        color = "white";
        filled = false;
    }

    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void printInfo() {
        System.out.println("color: " + color);
        System.out.println("filled: " + filled);
    }
}