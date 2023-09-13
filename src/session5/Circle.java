package session5;

public class Circle {
    private static int numberOfCircles = 0;
    private int id;
    private double radius;

    public Circle(double radius) {
        this.id = ++numberOfCircles;
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public double getRadius() {
        return radius;
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

    // Các phần còn lại của lớp Circle

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.0);

        System.out.println("Circle 1 - ID: " + circle1.getId() + ", Radius: " + circle1.getRadius());
        System.out.println("Circle 2 - ID: " + circle2.getId() + ", Radius: " + circle2.getRadius());

        System.out.println("Số lượng đối tượng Circle đã được tạo: " + Circle.getNumberOfCircles());
    }
}
