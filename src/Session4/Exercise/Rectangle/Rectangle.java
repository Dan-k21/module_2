package Session4.Exercise.Rectangle;

public class Rectangle {
    public int length;
    public int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void area(int length, int width) {
        System.out.println("Diện tích là: " + (length * width));
    }

    public void perimeter(int length, int width) {
        System.out.println("Chu vi là: " + Math.floor(((length + width) / 2) * 10) / 10);
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle hcn = new Rectangle(6, 5);
        System.out.println("Length: " + hcn.length);
        System.out.println("Width: " + hcn.width);
        hcn.area(hcn.length, hcn.width);
        hcn.perimeter(hcn.length, hcn.width);
    }
}
