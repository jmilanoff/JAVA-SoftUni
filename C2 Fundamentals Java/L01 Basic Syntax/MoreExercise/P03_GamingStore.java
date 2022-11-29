package L1_BasicSyntax.MoreExercise;

import java.util.Scanner;

public class P03_GamingStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();

        double price = 0;
        double totalSpent = 0;

        boolean isEnded = false;

        while (!game.equals("Game Time")) {

            switch (game) {
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    game = scanner.nextLine();
                    continue;
            }

            if (price > currentBalance) {
                System.out.println("Too Expensive");
                game = scanner.nextLine();
                continue;
            } else {
                currentBalance -= price;
                totalSpent += price;
                System.out.println("Bought " + game);
            }

            if (currentBalance == 0) {
                System.out.println("Out of money!");
                isEnded = true;
                break;
            }

            game = scanner.nextLine();
        }

        if (!isEnded) {

            System.out.printf("Total spent: $%.2f. ", totalSpent);
            System.out.printf("Remaining: $%.2f", currentBalance);

        }
    }
}

//100/100