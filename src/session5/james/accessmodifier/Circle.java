package session5.james.accessmodifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle() {}
    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(double radius) {
        return Math.pow(radius, 2) * 3.14;
    }
}
class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(6.3);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea(6.3));
    }
}
