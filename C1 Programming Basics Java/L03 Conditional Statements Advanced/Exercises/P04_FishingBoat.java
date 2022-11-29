package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P04_FishingBoat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (people >= 0 && people <= 6) {
            switch (season) {
                case "Spring":
                    price = 3000 * 0.9;
                    if (people % 2 == 0) {
                        price = price * 0.95;
                    }
                    break;
                case "Summer":
                    price = 4200 * 0.9;
                    if (people % 2 == 0) {
                        price = price * 0.95;
                    }
                    break;
                case "Autumn":
                    price = 4200 * 0.9;
                    break;
                case "Winter":
                    price = 2600 * 0.9;
                    if (people % 2 == 0) {
                        price = price * 0.95;
                    }
                    break;
            }

        } else if (people >= 7 && people <= 11) {
            switch (season) {
                case "Spring":
                    price = 3000 * 0.85;
                    if (people % 2 == 0) {
                        price = price * 0.95;
                    }
                    break;
                case "Summer":
                    price = 4200 * 0.85;
                    if (people % 2 == 0) {
                        price = price * 0.95;
                    }
                    break;
                case "Autumn":
                    price = 4200 * 0.85;
                    break;
                case "Winter":
                    price = 2600 * 0.85;
                    if (people % 2 == 0) {
                        price = price * 0.95;
                    }
                    break;
            }

        } else if (people >= 12) {
            switch (season) {
                case "Spring":
                    price = 3000 * 0.75;
                    if (people % 2 == 0) {
                        price = price * 0.95;
                    }
                    break;
                case "Summer":
                    price = 4200 * 0.75;
                    if (people % 2 == 0) {
                        price = price * 0.95;
                    }
                    break;
                case "Autumn":
                    price = 4200 * 0.75;
                    break;
                case "Winter":
                    price = 2600 * 0.75;
                    if (people % 2 == 0) {
                        price = price * 0.95;
                    }
                    break;
            }
        }
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}

