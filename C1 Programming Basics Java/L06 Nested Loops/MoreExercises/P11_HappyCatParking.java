package L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P11_HappyCatParking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double dailyBill = 0;
        double totalBill = 0;

        for (int days = 1; days <= countDays; days++) {
            for (int hours = 1; hours <= hoursPerDay; hours++) {
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
            System.out.printf("Day: %d - %.2f leva\n", days, dailyBill);
            dailyBill = 0;
        }
        System.out.printf("Total: %.2f leva", totalBill);
    }
}

//100/100