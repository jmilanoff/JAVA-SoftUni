package L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P05_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double outfitPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;

        if (extras > 150) {
        outfitPrice = outfitPrice * 0.9;
        }

        double expenses = extras * outfitPrice + decor;

        if (expenses > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", expenses - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - expenses);
        }
    }
}
