package session9.view;

import session9.manager.StudentManager;
import session9.model.Student;

import java.util.Scanner;

public class Menu {
    private StudentManager studentManager = new StudentManager();
    private Scanner inputInt = new Scanner(System.in);
    private Scanner inptuString = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("---- Quản lý sinh viên -----\n1. Thêm sinh viên\n2. Xóa sinh viên\n3. Sửa sinh viên\n4. Tìm kiếm theo ID\n5. Hiển thị tất cả\n0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuDel();
                    break;
                case 3:
                    showMenuEdit();
                    break;
                case 4:
                    showMenuSearchById();
                    break;
                case 5:
                    showSeachMenuByName();
                    break;
                case 6:
                    showAll();
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuEdit() {
        System.out.println("------- Menu sửa --------");
        System.out.println("Nhập id muốn sửa: ");
        int id = inputInt.nextInt();
        System.out.println("Nhập tên: ");
        String name = inptuString.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = inptuString.nextLine();
        System.out.println("Nhập điểm toán: ");
        double math = inputInt.nextDouble();
        System.out.println("Nhập điểm anh: ");
        double english = inputInt.nextDouble();
        System.out.println("Nhập điểm lịch sử: ");
        double history = inputInt.nextDouble();
        Student newStudent = new Student(id, name, gender, math, english, history);
        studentManager.edit(id, newStudent);
        System.out.println("=====> Sửa thành công\n");
    }

    public void showMenuAdd() {
        System.out.println("------ Menu thêm mới ------");
        System.out.println("Nhập tên: ");
        String name = inptuString.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = inptuString.nextLine();
        System.out.println("Nhập điểm toán: ");
        double math = inputInt.nextDouble();
        System.out.println("Nhập điểm anh: ");
        double english = inputInt.nextDouble();
        System.out.println("Nhập điểm lịch sử: ");
        double history = inputInt.nextDouble();
        Student student = new Student(name,gender, math, english, history);
        studentManager.add(student);
        System.out.println("====> Thêm sinh viên thành công!!!\n");
    }

    public void showAll() {
        Student[] students = studentManager.findAll();
        int size = studentManager.getSize();
        if (size > 0) {
            System.out.println("Danh sách sinh viên là : \n");
            for (int i = 0; i < size; i++) {
                System.out.println(students[i]);
            }
        } else {
            System.out.println("Không có\n");
        }
    }

    public void showMenuDel() {
        System.out.println("Nhập ID muốn xoá: ");
        int id = inputInt.nextInt();
        int index = studentManager.findById(id);
        if (index != -1) {
            studentManager.delete(id);
            System.out.println("==> Xoá thành công\n");
        } else {
            System.out.println("Không có sinh viên này\n");
        }
    }

    public void showMenuSearchById() {
        System.out.println("\n--- Tìm kiếm sinh viên bằng ID---");
        System.out.print("Nhập ID sinh viên: ");
        int id = inputInt.nextInt();
        if (studentManager.checkId(id) == false) {
            System.out.println("\nKhông có sinh viên này");
        } else {
            System.out.println("\nThông tin sinh viên cần tìm: ");
            System.out.println(studentManager.findStudentById(id));
        }
    }

    public void showSeachMenuByName() {
        System.out.println("\n--- 5.Danh sách sinh viên cần tìm ---");
        System.out.println("Nhập tên bạn muốn tìm: ");
        String name = inptuString.nextLine();
        if (studentManager.checkName(name) == false) {
            System.out.println("Không có sinh viên này trong danh sách");
        } else {
            System.out.println("\nDanh sách sinh viên cần tìm: ");
            for (Student student : studentManager.findStudentByName(name)) {
                System.out.println(student);
            }
        }
    }
}
