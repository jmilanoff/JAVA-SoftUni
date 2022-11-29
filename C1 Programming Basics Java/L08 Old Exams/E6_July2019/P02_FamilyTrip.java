package L08_OldExams.E6_July2019;

import java.util.Scanner;

public class P02_FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int addExpenses = Integer.parseInt(scanner.nextLine());

        double updatedBudget = budget * ((100 - addExpenses) / 100.00);

        if (nights > 7) {
            pricePerNight = pricePerNight * 0.95;
        }
        double totalPrice = nights * pricePerNight;

        if (updatedBudget >= totalPrice) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", updatedBudget - totalPrice);
        } else {
            System.out.printf("%.2f leva needed.", totalPrice - updatedBudget);
        }
    }
}

//100 / 100