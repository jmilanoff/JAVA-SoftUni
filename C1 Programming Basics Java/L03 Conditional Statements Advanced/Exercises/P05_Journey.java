package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        String destination = "";
        String type = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.3;
                type = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.7;
                type = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.4;
                type = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.8;
                type = "Hotel";
            }
        } else if (budget > 1000) {
            destination = "Europe";
                price = budget * 0.9;
                type = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", type, price);
        }
    }

