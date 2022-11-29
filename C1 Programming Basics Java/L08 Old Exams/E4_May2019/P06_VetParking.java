package L08_OldExams.E4_May2019;

import java.util.Scanner;

public class P06_VetParking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int totalDays = Integer.parseInt(scanner.nextLine());
         int totalHours = Integer.parseInt(scanner.nextLine());

         double totalBill = 0;
         double price = 0;
         int currentDay = 0;

        for (int days = 1; days <= totalDays; days++) {
            currentDay++;
            double dailyBill = 0;

            for (int hours = 1; hours <= totalHours; hours++) {
                if (days % 2 == 0 && hours % 2 != 0) {
                    price = 2.50;
                } else if (days % 2 != 0 && hours % 2 == 0) {
                    price = 1.25;
                } else {
                    price = 1;
                }
                dailyBill += price;
            }
            totalBill += dailyBill;
            System.out.printf("Day: %d - %.2f leva\n", currentDay, dailyBill);
        }
        System.out.printf("Total: %.2f leva", totalBill);
    }
}

//100/100