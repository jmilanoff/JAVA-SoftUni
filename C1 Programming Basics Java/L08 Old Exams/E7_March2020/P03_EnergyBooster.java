package L08_OldExams.E7_March2020;

import java.util.Scanner;

public class P03_EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")) {
                    price = 2 * 56;
                } else if (size.equals("big")) {
                    price = 5 * 28.70;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    price = 2 * 36.66;
                } else if (size.equals("big")) {
                    price = 5 * 19.60;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    price = 2 * 42.10;
                } else if (size.equals("big")) {
                    price = 5 * 24.80;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    price = 2 * 20;
                } else if (size.equals("big")) {
                    price = 5 * 15.20;
                }
                break;
        }

        double bill = price * number;

        if (bill >= 400 && bill <= 1000) {
            bill = bill * 0.85;
        } else if (bill > 1000) {
            bill = bill * 0.5;
        }

        System.out.printf("%.2f lv.", bill);
    }
}

//100/100
