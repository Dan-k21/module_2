package session8.exercise;

public class Student {
    private int id;
    private String name;
    private String sex;
    private double[] point;
    private static int idIncrement = 1;
    public Student(String name, String sex  , double[] point) {
        this.id = idIncrement;
        this.name = name;
        this.sex = sex;
        this.point = point;
        idIncrement++;
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

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double[] getPoint() {
        return this.point;
    }

    public void setPoint(double[] point) {
        this.point = point;
    }

    public double getAvg() {
        double sum = 0;
        for (int i = 0; i < point.length; i++) {
            sum += point[i];
        }
        return sum / point.length;
    }
}
