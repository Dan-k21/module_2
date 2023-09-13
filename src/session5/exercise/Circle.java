package session5.exercise;

public class Circle {
    private static int nextId;
    private int id = 1;
    private double radius;
    static final double PI = 3.14;

    public Circle(double radius) {
        this.id = ++nextId;
        this.radius = radius;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int quantity() {
        return nextId;
    }

    public double getArea() {
        return Math.pow(radius, 2) * PI;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    public void maxRadius(double radius) {

    }
}

class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(6.0);
        Circle circle2 = new Circle(3.0);
        Circle circle3 = new Circle(23.4);
        Circle circle4 = new Circle(234.5);
        System.out.println("ID: " + circle1.getId() + ", Radius: " + circle1.getRadius() + ", Area: " + circle1.getArea() + ", Circumference: " + circle1.getCircumference());
        System.out.println("ID: " + circle2.getId() + ", Radius: " + circle2.getRadius() + ", Area: " + circle2.getArea() + ", Circumference: " + circle2.getCircumference());
        System.out.println("ID: " + circle3.getId() + ", Radius: " + circle3.getRadius() + ", Area: " + circle3.getArea() + ", Circumference: " + circle3.getCircumference());
        System.out.println("ID: " + circle4.getId() + ", Radius: " + circle4.getRadius() + ", Area: " + circle4.getArea() + ", Circumference: " + circle4.getCircumference());
        System.out.println("Quantity: " + Circle.quantity());
    }
}
