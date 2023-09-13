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

    public void maxRadius(double[] circle) {
        double max = circle[0];
        for (int i = 0; i < circle.length; i++) {
            if (max < circle[i]) {
                max = circle[i];
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
//        Circle circle1 = new Circle(6.0);
//        Circle circle2 = new Circle(3.0);
//        Circle circle3 = new Circle(23.4);
//        Circle circle4 = new Circle(234.5);
        Circle[] circles = {
                new Circle(5.0),
                new Circle(4.9),
                new Circle(9.65),
                new Circle(6.2)
        };
        System.out.println("ID: " + circles[1].getId() + ", Radius: " + circles[1].getRadius() + ", Area: " + circles[1].getArea() + ", Circumference: " + circles[1].getCircumference());
        System.out.println("ID: " + circles[2].getId() + ", Radius: " + circles[2].getRadius() + ", Area: " + circles[2].getArea() + ", Circumference: " + circles[2].getCircumference());
        System.out.println("ID: " + circles[3].getId() + ", Radius: " + circles[3].getRadius() + ", Area: " + circles[3].getArea() + ", Circumference: " + circles[3].getCircumference());
        System.out.println("ID: " + circles[4].getId() + ", Radius: " + circles[4].getRadius() + ", Area: " + circles[4].getArea() + ", Circumference: " + circles[4].getCircumference());
        System.out.println("Quantity: " + Circle.quantity());
    }
}
