package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        divisorsOddAndMultiplesEven();
    }

    public static void checkSquareNumber() {
        Scanner num = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int number1 = num.nextInt();
        System.out.println("Nhập số b: ");
        int number2 = num.nextInt();
        if (number1 < number2) {
            for (int i = number1; i <= number2; i++) {
                if (Math.sqrt(i) == Math.round(Math.sqrt(i))) {
                    System.out.println(i);
                }
            }
        }
        if (number1 > number2) {
            for (int i = number2; i <= number1; i++) {
                if (Math.sqrt(i) == Math.round(Math.sqrt(i)))
                    System.out.println(i);
            }
        }
    }

    public static void check() {
        Scanner num = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int number = num.nextInt();
        if (number % 2 == 0) {
            System.out.println("Đây là số chẵn");
        } else if (number % 2 != 0) {
            System.out.println("Đây là số lẻ");
        } else {
            System.out.println("Không có");
        }
    }

    public static void findMax() {
        Scanner num = new Scanner(System.in);
        System.out.print("Nhập số 1: ");
        int number1 = num.nextInt();
        System.out.print("Nhập số 2: ");
        int number2 = num.nextInt();
        System.out.print("Nhập số 3: ");
        int number3 = num.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println("Số lớn nhất là số " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Số lớn nhất là số " + number2);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Số lớn nhất là số " + number3);
        } else {
            System.out.println("Không có");
        }
    }

    public static void times() {
        Scanner num = new Scanner(System.in);
        System.out.print("Số bánh cần rán: ");
        int number = num.nextInt();
        int times;
        if (number >= 9) {
            times = number / 9;
            System.out.println("Số lần rán: " + times);
        } else if (number < 9 && number > 0) {
            System.out.println("Số lần rán: 1");
        } else {
            System.out.println("Không có");
        }
    }

    public static void interestRate() {
        Scanner num = new Scanner(System.in);
        System.out.print("Số tiền bạn muốn gửi: ");
        double money = num.nextInt();
        System.out.print("Thời gian(Năm): ");
        double year = num.nextInt();
        double interest = money * (5.0 / 100.0) * year;
        System.out.println("Lãi suất hàng năm là: " + interest);
    }

    public static void classification() {
        Scanner num = new Scanner(System.in);
        System.out.println("Nhập điểm học sinh: ");
        double point = num.nextDouble();
        if (point <= 10 && point >= 8) {
            System.out.println("Học sinh giỏi");
        } else if (point < 8 && point >= 3.5) {
            System.out.println("Học sinh khá");
        } else if (point < 3.5 && point >= 0) {
            System.out.println("Ngu");
        } else {
            System.out.println("Không có");
        }
    }

    public static void odd() {
        Scanner num = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int number1 = num.nextInt();
        System.out.println("Nhập số b: ");
        int number2 = num.nextInt();
        if (number1 < number2) {
            for (int i = number1; i <= number2; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        if (number1 > number2) {
            for (int i = number2; i < number1; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void fizzBuzz() {
        Scanner num = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int number1 = num.nextInt();
        System.out.println("Nhập số b: ");
        int number2 = num.nextInt();
        if (number1 < number2) {
            for (int i = number1; i <= number2; i++) {
                if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
            }
        } else if (number2 < number1) {
            for (int i = number2; i <= number1; i++) {
                if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
            }
        } else {
            System.out.println("Không có");
        }
    }

    public static void sum() {
        Scanner num = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int number1 = num.nextInt();
        System.out.println("Nhập số b: ");
        int number2 = num.nextInt();
        int sum = 0;
        if (number1 < number2) {
            for (int i = number1; i <= number2; i++) {
                sum += i;
            }
            System.out.println("Tổng: " + sum);
        }
        if (number2 < number1) {
            for (int i = number2; i <= number1; i++) {
                sum += i;
            }
            System.out.println("Tổng: " + sum);
        }
    }

    public static void sumTotal() {
        Scanner num = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int number1 = num.nextInt();
        System.out.println("Nhập số b: ");
        int number2 = num.nextInt();
        int sum = 0;
        if (number1 < number2) {
            for (int i = number1; i <= number2; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("Tổng số chẵn: " + sum);
        }
        if (number1 > number2) {
            for (int i = number2; i <= number1; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("Tổng số chẵn: " + sum);
        }
    }

    public static void sumSquare() {
        Scanner num = new Scanner(System.in);
        System.out.println("Nhập số x: ");
        int number1 = num.nextInt();
        System.out.println("Nhập số y: ");
        int number2 = num.nextInt();
        int sum = 0;
        if (number1 < number2) {
            for (int i = number1; i <= number2; i++) {
                sum += i * i;
            }
            System.out.println("Tổng: " + sum);
        }
        if (number2 < number1) {
            for (int i = number2; i <= number1; i++) {
                sum += i * i;
            }
            System.out.println("Tổng: " + sum);
        }
    }

    public static void calS1() {
        Scanner num = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int number = num.nextInt();
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result += i * (i + 1);
        }
        System.out.println("S = " + result);
    }

    public static void calS2() {
        Scanner num = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int number = num.nextInt();
        double result = 0;
        for (double i = 0; i <= number; i++) {
            result += (2 * i + 1) / (2 * i + 2);
        }
        System.out.println("S = " + result);
    }

    public static void calS3() {
        Scanner num = new Scanner(System.in);
        System.out.println("Nhập số n: ");
        int number = num.nextInt();
        double result = 0;
        for (double i = 1; i <= number; i++) {
            result += (i * (i + 1)) / ((i + 1) * (i + 2));
        }
        System.out.println("S = " + result);
    }

    public static void divisorsAndMultiples() {
        int number = 12;
        System.out.print("Ước của 12: ");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("Bội nhỏ hơn 100 của 12: ");
        for (int i = 0; ; i++) {
            if (number * i > 100) {
                break;
            }
            System.out.print(number * i + " ");
        }
    }

    public static void divisorsOddAndMultiplesEven() {
        int number = 12;
        int maxOdd = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                if (i % 2 != 0) {
                    maxOdd = i;
                }
            }
        }
        System.out.print("Ước lẻ lớn nhất của 12: " + maxOdd);
        for (int i = 0; ; i++) {

        }
//        System.out.print("Bội chẵn nhỏ nhất của 12: ");
    }
}
