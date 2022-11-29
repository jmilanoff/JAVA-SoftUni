package L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P01_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double finalBudget = 0;
        double singlePrice = 0;

        if (people >= 1 && people <= 4) {
            finalBudget = budget * 0.25;
        } else if (people >= 5 && people <= 9) {
            finalBudget = budget * 0.4;
        } else if (people >= 10 && people <= 24) {
            finalBudget = budget * 0.5;
        } else if (people >= 25 && people <= 49) {
            finalBudget = budget * 0.6;
        } else if (people >= 50) {
            finalBudget = budget * 0.75;
        }

        switch (category) {

            case "VIP":
                singlePrice = 499.99;
                double totalPrice = people * singlePrice;

                if (finalBudget > totalPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", finalBudget - totalPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", totalPrice - finalBudget);
                }
                break;
            case "Normal":
                singlePrice = 249.99;
                totalPrice = people * singlePrice;
                if (finalBudget > totalPrice) {
                    System.out.printf("Yes! You have %.2f leva left.", finalBudget - totalPrice);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", totalPrice - finalBudget);
                }
                break;
        }
    }
}

//100/100