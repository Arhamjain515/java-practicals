// Shape.java
class Shape {

    // Compile-time polymorphism: Method overloading
    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Method to be overridden
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Circle.java
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Run-time polymorphism: Method overriding
    @Override
    public void display() {
        System.out.println("This is a Circle.");
        System.out.println("Area: " + (Math.PI * radius * radius));
    }
}

// Rectangle.java
class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void display() {
        System.out.println("This is a Rectangle.");
        System.out.println("Area: " + (length * breadth));
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {

        // Compile-time polymorphism
        Shape shape = new Shape();

        System.out.println("=== Method Overloading ===");
        System.out.println("Area of square: " + shape.calculateArea(5));
        System.out.println("Area of rectangle: " + shape.calculateArea(5, 10));

        // Run-time polymorphism using parent-class references
        System.out.println("\n=== Method Overriding ===");

        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(5, 10);

        s1.display();
        System.out.println();

        s2.display();
    }
}
