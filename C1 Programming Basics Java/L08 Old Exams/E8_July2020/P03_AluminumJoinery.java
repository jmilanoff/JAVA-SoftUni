package L08_OldExams.E8_July2020;

import java.util.Scanner;

public class P03_AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();

        if (number <= 10) {
            System.out.println("Invalid order");
        }

        double price = 0;

        switch (type) {
            case "90X130":
                 if (number > 10 && number <= 30) {
                    price = 110;
                } else if (number <= 60) {
                    price = 110 * 0.95;
                } else {
                    price = 110 * 0.92;
                }
                break;
            case "100X150":
                if (number > 10 && number <= 40) {
                    price = 140;
                } else if (number <= 80) {
                    price = 140 * 0.94;
                } else {
                    price = 140 * 0.9;
                }
                break;
            case "130X180":
                if (number > 10 && number <= 20) {
                    price = 190;
                } else if (number <= 50) {
                    price = 190 * 0.93;
                } else {
                    price = 190 * 0.88;
                }
                break;
            case "200X300":
                if (number > 10 && number <= 25) {
                    price = 250;
                } else if (number <= 50) {
                    price = 250 * 0.91;
                } else {
                    price = 250 * 0.86;
                }
                break;
        }

        double bill = price * number;

        if (number > 10 && number <= 99) {
            if (delivery.equals("With delivery")) {
                bill = bill + 60;
                System.out.printf("%.2f BGN", bill);
            } else if (delivery.equals("Without delivery")) {
                System.out.printf("%.2f BGN", bill);
            }

        } else if (number > 99) {
            if (delivery.equals("With delivery")) {
                bill = (bill + 60) * 0.96;
                System.out.printf("%.2f BGN", bill);
            } else if (delivery.equals("Without delivery")) {
                bill = bill * 0.96;
                System.out.printf("%.2f BGN", bill);
            }
        }
    }
}

// 100/100 (⚠️бях писал при липса на отстъпка price = price, което по начало е 0, вместо да пиша единичната цена)