package Session4.Exercise.Student;

public class Student {
    public String name;
    public int age;
    public int[] point;
    Student(String name, int age, int[] point) {
        this.name = name;
        this.age = age;
        this.point = point;
    }
    public void avg(int[] point) {
        int sum = 0;
        for (int i = 0; i < point.length; i++) {
            sum += point[i];
        }
        int avg = sum / 3;
        System.out.println("Điểm trung bình: " + avg);
    }
}
class Main {
    public static void main(String[] args) {
        int[] point1 = {9,7,10};
        Student st1 = new Student("Dân", 16, point1);
        System.out.println("Tên: " + st1.name);
        System.out.println("Tuổi: " + st1.age);
        st1.avg(point1);
        int[] point2 = {8,6,9};
        Student st2 = new Student("Linh", 8, point2);
        System.out.println("Tên: " + st2.name);
        System.out.println("Tuổi: " + st2.age);
        st2.avg(point2);
    }
}