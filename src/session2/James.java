package session2;

import java.util.Scanner;

public class James {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Kiểm tra số nguyên tố
//        System.out.println("Nhập số: ");
//        int num = input.nextInt();
//        int count = 0;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                count++;
//            }
//        }
//        if (count == 2) {
//            System.out.println("Đây là số nguyên tố");
//        } else {
//            System.out.println("Đây không là số nguyên tố");
//        }
//        Tính tiền lãi cho vay
//        System.out.println("Số tiền cho vay: ");
//        Double money = input.nextDouble();
//        System.out.println("Tỉ lệ lãi suất theo tháng: ");
//        Double interestRate = input.nextDouble();
//        System.out.println("Số tháng cho vay: ");
//        Double month = input.nextDouble();
//        Double interest = money * (interestRate / 12) * month;
//        System.out.println("Số tiền lãi là: " + interest);
//        Ước chung lớn nhất của 2 số
//        System.out.println("Nhập a: ");
//        int a = Math.abs(input.nextInt());
//        System.out.println("Nhập b: ");
//        int b = Math.abs(input.nextInt());
//        if (a == 0 || b == 0) {
//            System.out.println("Không có");
//        }
//        while (a != b) {
//            if (a > b) {
//                a -= b;
//            } else {
//                b -= a;
//            }
//        }
//        System.out.println("Ước chung lớn nhất của 2 số là: " + a);
//        Thiết kế menu
//        int choice = -1;
//        while (choice != 0) {
//            System.out.println("Thích gì?");
//            System.out.println("1. Hình vuông");
//            System.out.println("2. Hình chữ nhật");
//            System.out.println("3. Hình tam giác");
//            choice = input.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Hình vuông");
//                    System.out.println("******");
//                    System.out.println("******");
//                    System.out.println("******");
//                    break;
//                case 2:
//                    System.out.println("Hình chữ nhật");
//                    System.out.println("**********");
//                    System.out.println("**********");
//                    System.out.println("**********");
//                    break;
//                case 3:
//                    System.out.println("Hình tam giác");
//                    System.out.println("*");
//                    System.out.println("**");
//                    System.out.println("***");
//                    break;
//                default:
//                    System.out.println("Không có");
//            }
//        }
        // Hiển thị các loại hình
//        int choice = -1;
//        while (choice != 0) {
//            System.out.println("Menu: ");
//            System.out.println("1. Hình chữ nhật");
//            System.out.println("2. Tam giác vuông");
//            System.out.println("3. Tam giác cân");
//            choice = input.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Hình chữ nhật");
//                    for (int i = 0; i < 3; i++) {
//                        for (int j = 0; j < 7; j++) {
//                            System.out.print("* ");
//                        }
//                        System.out.println();
//                    }
//                    break;
//                case 2:
//                    System.out.println("Tam giác vuông");
//                    for (int i = 0; i < 7; i++) {
//                        for (int j = 0; j < i; j++) {
//                            System.out.print("* ");
//                        }
//                        System.out.println();
//                    }
//                    break;
//                case 3:
//                    System.out.println("Tam giác cân");
//                    for (int i = 1; i < 8; i++) {
//                        for (int j = 1; j < 8 - i; j++) {
//                            System.out.print(" ");
//                        }
//                        for (int j = 1; j <= 2 * i - 1; j++) {
//                            System.out.print("*");
//                        }
//                        System.out.println();
//                    }
//                default:
//                    System.out.println("Không có");
//            }
//        }
//        In ra số nguyên tố
//        System.out.println("Nhập số lượng: ");
//        int quantity = input.nextInt();
//        int num = 2;
//        int count = 0;
//        while (count < quantity) {
//            if (check(num)) {
//                System.out.println(num);
//                count++;
//            }
//            num++;
//        }
//    }
//
//    public static boolean check(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
    }
}