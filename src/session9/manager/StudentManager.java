package session9.manager;

import session9.model.Student;

import java.util.ArrayList;

public class StudentManager implements IManager<Student> {
    private Student[] list = new Student[100];
    private int size = 0;

    @Override
    public void add(Student newStudent) {
        this.list[size] = newStudent;
        this.size++;
    }

    @Override
    public void delete(int id) {
        int index = findById(id);
        for (int i = index; i < size; i++) {
            this.list[i] = this.list[i + 1];
        }
        size--;
    }

    @Override
    public void edit(int id, Student student) {
        int index = findById(id);
        this.list[index] = student;
    }

    @Override
    public Student[] findAll() {
        return this.list;
    }

    public int findById(int id) {
        for (int i = 0; i < size; i++) {
            if (id == this.list[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    public int getSize() {
        return this.size;
    }

    public boolean checkId(int id) {
        boolean checkId = true;
        int index = findById(id);
        if (index == -1) {
            checkId = false;
        }
        return checkId;
    }

    public Student findStudentById(int id) {
        for (Student student : this.list) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public boolean checkName(String name) {
        boolean checkName = false;
        for (int i = 0; i < size; i++) {
            if (list[i].getName().toLowerCase().contains(name.toLowerCase())) {
                checkName = true;
            }
        }
        return checkName;
    }

    public ArrayList<Student> findStudentByName(String name) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (list[i].getName().toLowerCase().contains(name.toLowerCase())) {
                students.add(list[i]);
            }
        }
        return students;
    }

}
