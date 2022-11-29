package L08_OldExams.E4_May2019;

import java.util.Scanner;

public class P02_Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double neededFuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double fuelPrice = 2.10;
        double guidePrice = 100;
        double totalExpenses = fuelPrice * neededFuel + guidePrice;

        if (day.equals("Saturday")) {
            totalExpenses = totalExpenses * 0.9;
        } else if (day.equals("Sunday")) {
            totalExpenses = totalExpenses * 0.8;
        }

        if (budget >= totalExpenses) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - totalExpenses);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", totalExpenses - budget);
        }
    }
}

//100/100