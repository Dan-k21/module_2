package Session1;

import java.util.Scanner;

public class James {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Chuyển đổi tiền tệ
        double vnd = 23000;
        System.out.print("USD: ");
        double money = input.nextDouble();
        double usd = money * vnd;
        System.out.println("VND: " + usd);
    }
}
