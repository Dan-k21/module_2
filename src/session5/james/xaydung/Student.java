package session5.james.xaydung;

public class Student {
    private String name = "John";
    private String clazz = "C02";

    Student() {
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println(st1.getName());
        System.out.println(st1.getClazz());
        st1.setName("Dan");
        st1.setClazz("C06");
        System.out.println(st1.getName());
        System.out.println(st1.getClazz());
    }
}
