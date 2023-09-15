package inheritance.circle;

public class Circle {
    public double radius;
    public String color;
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * 3.14;
    }
}

class Cylinder extends Circle {
    public double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Bán kính: " + radius + "Chiều cao: " + height + "Màu: " + color;
    }
}

class Test {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder( 4.5, "red", 7.0);
        System.out.println(c1);
        System.out.println("Diện tích là: "+c1.getArea());
        System.out.println("Thể tích là: " + c1.getVolume());
    }
}