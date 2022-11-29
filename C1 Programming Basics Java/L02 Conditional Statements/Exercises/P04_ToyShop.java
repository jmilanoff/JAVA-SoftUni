package L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P04_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double order = (puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2);
        double totalToys = puzzles + dolls + bears + minions + trucks;
        double newOrder = 0;
        double finalSum = 0;

        if (totalToys >= 50) {
        newOrder = order * 0.75;
        finalSum = newOrder * 0.9;
        } else {
        newOrder = order;
        finalSum = newOrder * 0.9;
        }

        if (finalSum >= tripPrice) {
            double diff = finalSum - tripPrice;
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            double diff = tripPrice - finalSum;
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
