package session10.model;

public class Student {
    private int id;
    private String name;
    private String gender;
    private double[] points;
    private static int idIncrement = 1;
    public Student(String name, String gender, double point1, double point2, double point3) {
        this.id = idIncrement;
        this.name = name;
        this.gender = gender;
        this.points = new double[]{point1, point2, point3};
        idIncrement++;
    }

    public Student(int id, String name, String gender, double point1, double point2, double point3) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.points = new double[]{point1, point2, point3};
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double[] getPoints() {
        return points;
    }

    public void setPoints(double[] points) {
        this.points = points;
    }
}
