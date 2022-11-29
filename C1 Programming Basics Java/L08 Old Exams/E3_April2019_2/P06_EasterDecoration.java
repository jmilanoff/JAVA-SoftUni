package L08_OldExams.E3_April2019_2;

import java.util.Scanner;

public class P06_EasterDecoration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());
        double totalTurnover = 0;

        for (int i = 1; i <= clients; i++) {

            String purchase = scanner.nextLine();
            double currentBill = 0;
            int currentPurchases = 0;

            while (!purchase.equals("Finish")) {
                switch (purchase) {
                    case "basket":
                        currentBill += 1.50;
                        break;
                    case "wreath":
                        currentBill += 3.80;
                        break;
                    case "chocolate bunny":
                        currentBill += 7;
                        break;
                }
                currentPurchases++;
                purchase = scanner.nextLine();
            }

            if (currentPurchases % 2 == 0) {
                currentBill *= 0.8;
            }
            totalTurnover += currentBill;
            System.out.printf("You purchased %d items for %.2f leva.\n", currentPurchases, currentBill);

        }

        System.out.printf("Average bill per client is: %.2f leva.", totalTurnover / clients);

    }
}

//100/100