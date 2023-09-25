package session10.manager;

import session9.model.Student;

import java.util.ArrayList;

public class StudentManager implements IManager<Student> {
    private ArrayList<Student> students = new ArrayList<>();
    @Override
    public void add(Student student) {
        this.students.add(student);
    }

    @Override
    public void delete(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
            }
        }
    }

    @Override
    public void edit(int id, Student newStudent) {
        int index = findById(id);
        if (index != -1) {
            this.students.set(index, newStudent);
            System.out.println("Xong");
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public ArrayList<Student> showAll() {
        return null;
    }

    public int findById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (id == this.students.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }
}
