package session16.view;

import session16.input.Input;
import session16.manager.ProductManager;
import session16.model.Product;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private ProductManager listProduct = new ProductManager();

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("\n-----Quản lý sản phẩm-----\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Sửa sản phẩm\n" +
                    "3. Xóa sản phẩm\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "0. Thoát\n");
            System.out.print("Nhập lựa chọn: ");
            choice = Input.getInputInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuEdit();
                    break;
                case 3:
                    showMenuDelete();
                    break;
                case 4:
                    showListProduct();
                    break;
                default:
                    System.out.println("Không có");

            }
        } while (choice != 0);
    }

    public void showMenuAdd() {
        System.out.println("----Thêm sản phẩm----");
        System.out.print("Nhập tên: ");
        String name = Input.getInputString();
        System.out.print("Nhập số lượng: ");
        int quantity = Input.getInputInt();
        System.out.print("Nhập giá: ");
        int price = Input.getInputInt();
        System.out.print("Nhập loại: ");
        String category = Input.getInputString();
        Product products = new Product(name, quantity, price, category);
        listProduct.add(products);
    }

    public void showListProduct() {
        System.out.println("----Danh sách sản phẩm----");
        List<Product> list = listProduct.showAll();
        for (Product product: list) {
            System.out.println(product);
        }
    }

    public void showMenuEdit() {
        System.out.println("----Sửa sản phẩm theo ID----");
        System.out.print("Nhập ID: ");
        int id = Input.getInputInt();
        System.out.print("Nhập tên: ");
        String name = Input.getInputString();
        System.out.print("Nhập số lượng: ");
        int quantity = Input.getInputInt();
        System.out.print("Nhập giá: ");
        int price = Input.getInputInt();
        System.out.print("Nhập loại: ");
        String category = Input.getInputString();
        Product product = new Product(id, name, quantity, price, category);
        listProduct.edit(id, product);
    }

    public void showMenuDelete() {
        System.out.println("----Xóa sản phẩm theo ID----");
        System.out.print("Nhập ID muốn xóa: ");
        int id = Input.getInputInt();
        listProduct.delete(id);
    }
}
