package session8.exercise;

public class Main {
    public static void main(String[] args) {
        StudentManager clazz = new StudentManager();
        double[] point1 = {8.3,6.5,9.0};
        Student student1 = new Student("Dân", "Nam", point1);
        double[] point2 = {8.3,1.56,7};
        Student student2 = new Student("Linh", "Nữ", point2);
        double[] point3 = {5.6,1.5,9};
        Student student3 = new Student("Hiếu", "Nữ", point3);
    }
}
