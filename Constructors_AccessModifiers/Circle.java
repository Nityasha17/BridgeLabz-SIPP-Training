package OOPS_Constructors_AccessModifiers;

public class Circle {
    private double radius;

    public Circle() {
        this(1.0); // Default radius using constructor chaining
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }
}
