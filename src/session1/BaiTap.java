package session1;

import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Nhập xuất
//        1
//        System.out.println("Hello word");
//        2
//        System.out.print("Nhập tên: ");
//        String name = input.nextLine();
//        switch (name) {
//            case "NA":
//                System.out.println("Helle C06");
//                break;
//            default:
//                System.out.println("Không có");
//        }
//        3
//        int number = 5;
//        System.out.println(number);
//        4
//        int number1 = 13, number2 = 6;
//        System.out.println(number1 + number2);
//        System.out.println(number1 - number2);
//        System.out.println(number1 * number2);
//        System.out.println(number1 / number2);
//        System.out.println(number1 % number2);
//        5
//        System.out.print("Nhập tên: ");
//        String name = input.nextLine();
//        System.out.print("Nhập tuổi: ");
//        int age = input.nextInt();
//        System.out.println("Xin chào " + name + ", tôi năm nay " + age + " tuổi");

//        Toán tử
//        System.out.print("Nhập số 1: ");
//        int number1 = input.nextInt();
//        System.out.print("Nhập số 2: ");
//        int number2 = input.nextInt();
//        System.out.println(number1 + number2);
//        System.out.println(number1 - number2);
//        System.out.println(number1 * number2);
//        System.out.println(number1 / number2);
//        System.out.println(number1 % number2);
//        System.out.println(number1 += number2);
//        System.out.println(number1 -= number2);
//        System.out.println(number1 *= number2);
//        System.out.println(number1 /= number2);
//        System.out.println(++number1);
//        System.out.println(--number2);

//        Điều kiện
//        1
//        System.out.println("Nhập số a: ");
//        int numberA = input.nextInt();
//        System.out.println("Nhập số b: ");
//        int numberB = input.nextInt();
//        if (numberB % numberA == 0) {
//            System.out.println("a có chia hết cho b");
//        } else {
//            System.out.println("a không chia hết cho b");
//        }
//        2
//        System.out.println("Nhập tuổi: ");
//        int age = input.nextInt();
//        if (age >= 15) {
//            System.out.println("Bạn đủ điều kiện học lớp 10");
//        } else {
//            System.out.println("Bạn không đủ điều kiện học lớp 10");
//        }
//        3
//        System.out.println("Nhập số nguyên: ");
//        int number = input.nextInt();
//        if (number > 0) {
//            System.out.println("Số này lớn hơn 0");
//        } if (number < 0) {
//            System.out.println("Số này nhỏ hơn 0");
//        } if (number == 0){
//            System.out.println("Không có số này");
//        }
//        4
//        System.out.println("Nhập số nguyên 1: ");
//        int number1 = input.nextInt();
//        System.out.println("Nhập số nguyên 2: ");
//        int number2 = input.nextInt();
//        System.out.println("Nhập số nguyên 3: ");
//        int number3 = input.nextInt();
//        if (number1 < number3 && number2 < number3) {
//            System.out.print("Số lớn nhất trong 3 số là: " + number1);
//        } if (number1 < number2 && number3 < number2) {
//            System.out.println("Sỗ lớn nhất trong 3 số là: " + number2);
//        } if (number2 < number1 && number3 < number1) {
//            System.out.println("Số lớn nhất trong 3 số là: " + number3);
//        } else {
//            System.out.println("Không có số lớn nhất");
//        }
//        5
//        System.out.println("Nhập điểm bài kiểm tra: ");
//        int testScore = input.nextInt();
//        System.out.println("Nhập điểm giữa kì: ");
//        int midtermScore = input.nextInt();
//        System.out.println("Nhập điểm cuối kì: ");
//        int finalScore = input.nextInt();
//        int avg = (testScore + midtermScore + finalScore) / 3;
//        if (avg >= 0 && avg <= 10) {
//            if (avg >=8 && avg <= 10) {
//                System.out.println("Học sinh giỏi");
//            } if (avg >= 3.5 && avg < 8) {
//                System.out.println("Học sinh tiên tiến");
//            } if (avg >= 0 && avg < 3.5) {
//                System.out.println("Đúp");
//            }
//        } else {
//            System.out.println("Không có điểm này");
//        }
//        6
//        System.out.println("Số sản phẩm đã bán: ");
//        int quantity = input.nextInt();
//        if (quantity >= 0 && quantity <= 100) {
//            System.out.print("Hoa hồng nhận được là: " + (quantity * 0.05));
//            return;
//        } if (quantity > 100 && quantity <= 200) {
//            System.out.println("Hoa hồng nhận được là: " + (quantity * 0.07));
//            return;
//        } if (quantity > 200) {
//            System.out.println("Hoa hồng nhận được là: " + (quantity * 0.1));
//            return;
//        } else {
//            System.out.println("Không có");
//        }
//        7
//        System.out.println("Thời gian gọi: ");
//        int callTime = input.nextInt();
//        System.out.println("Giá cước (VD: 0.2k/phút): ");
//        Double fare = input.nextDouble();
//        Double totalFare = callTime * fare;
//        System.out.println("Cước điện thoại là: " + totalFare + " nghìn");
//        8
//        System.out.println("Nhập độ C: ");
//        Double degreesCelsius = input.nextDouble();
//        Double degreesFahrenheit = degreesCelsius * 1.8 + 32;
//        System.out.println("Độ F là: " + degreesFahrenheit);
//        9
//        System.out.println("Nhập số mét: ");
//        Double m = input.nextDouble();
//        Double ft = m * 3.2808;
//        System.out.println("Số feet là: " + ft);
//        10
//        System.out.println("Nhập cạnh a: ");
//        int side = input.nextInt();
//        Double area = Math.pow(side, 2);
//        System.out.println("Diện tích hình vuông là: " + area);
//        11
//        System.out.println("Nhập cạnh a: ");
//        int sideA = input.nextInt();
//        System.out.println("Nhập cạnh b: ");
//        int sideB = input.nextInt();
//        int area = sideA * sideB;
//        System.out.println("Diện tích hình chữ nhật là: " + area);
//        12
//        System.out.println("Nhập cạnh a: ");
//        int sideA = input.nextInt();
//        System.out.println("Nhập cạnh b: ");
//        int sideB = input.nextInt();
//        int area = sideA * sideB / 2;
//        System.out.println("Diện tích tam giác vuông là: " + area);
//        13
//        System.out.println("Nhập a: ");
//        Double a = input.nextDouble();
//        System.out.println("Nhập b: ");
//        Double b = input.nextDouble();
//        Double eq = -b / a;
//        System.out.println("Vậy x = " + eq);
//        14
//        System.out.println("Nhập a: ");
//        Double a = input.nextDouble();
//        System.out.println("Nhập b: ");
//        Double b = input.nextDouble();
//        System.out.println("Nhập c: ");
//        Double c = input.nextDouble();
//        Double eq1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
//        Double eq2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
//        System.out.println("Vậy x1 = " + eq1 + ", x2 = " + eq2);
//        15
//        System.out.println("Nhập tuổi: ");
//        int age = input.nextInt();
//        if (age > 0 && age <= 120) {
//            System.out.println("Đây là tuổi của 1 người");
//        } else {
//            System.out.println("Đây không là tuổi của 1 người");
//        }
//        16
//        System.out.println("Nhập cạnh a: ");
//        int sideA = input.nextInt();
//        System.out.println("Nhập cạnh b: ");
//        int sideB = input.nextInt();
//        System.out.println("Nhập cạnh c: ");
//        int sideC = input.nextInt();
//        if (sideA > 0 && sideB > 0 && sideC > 0) {
//            if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
//                System.out.println("a, b, c là cạnh của 1 tam giác");
//            }
//        } else {
//            System.out.println("a, b, c không là cạnh của 1 tam giác");
//        }
//        17
//        System.out.println("Nhập số kWh: ");
//        Double kwh = input.nextDouble();
//        Double ep;
//        if (kwh >= 0) {
//            if (kwh >= 0 && kwh <= 0) {
//                ep = kwh * 1.678;
//                System.out.println("Giá điện là: " + ep + " nghìn");
//            } else if (kwh > 50 && kwh <= 100) {
//                ep = kwh * 1.734;
//                System.out.println("Giá điện là: " + ep + " nghìn");
//            } else if (kwh > 100 && kwh <= 200) {
//                ep = kwh * 2.014;
//                System.out.println("Giá điện là: " + ep + " nghìn");
//            } else {
//                ep = kwh * 2.927;
//                System.out.println("Giá điện là: " + ep + " nghìn");
//            }
//        } else {
//            System.out.println("Không có");
//        }
//        18
//        System.out.println("Nhập số tiền (Triệu): ");
//        Double money = input.nextDouble();
//        Double tax;
//        if (money >= 0) {
//            if (money >= 0 && money <= 5) {
//                tax = money * 0.05;
//                System.out.println("Thuế thu nhập cá nhân là " + tax + " triệu");
//            } else if (money > 5 && money <=10) {
//                tax = money * 0.1;
//                System.out.println("Thuế thu nhập cá nhân là " + tax + " triệu");
//            } else if (money > 10 && money <=18) {
//                tax = money * 0.15;
//                System.out.println("Thuế thu nhập cá nhân là " + tax + " triệu");
//            } else if (money > 18 && money <=32) {
//                tax = money * 0.2;
//                System.out.println("Thuế thu nhập cá nhân là " + tax + " triệu");
//            } else {
//                tax = money * 0.35;
//                System.out.println("Thuế thu nhập cá nhân là " + tax + " triệu");
//            }
//        }
    }
}
