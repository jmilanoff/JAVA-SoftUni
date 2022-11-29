package L08_OldExams.E4_May2019;

import java.util.Scanner;

public class P04_TouristShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countProducts = 0;
        double bill = 0;

        for (int i = 1; i > 0; i++) {
            String product = scanner.nextLine();

            if (product.equals("Stop")) {
                System.out.printf("You bought %d products for %.2f leva.", countProducts, bill);
                break;
            }

            double price = Double.parseDouble(scanner.nextLine());
                if (i % 3 == 0) {
                    price /= 2;
                }

            double remainder = budget - bill;

            if (price > remainder) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", Math.abs(price - remainder));
                break;
            }

            bill += price;
            countProducts++;

        }

    }
}

//100/100