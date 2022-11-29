package L1_BasicSyntax.Exercise;

import java.util.Scanner;

public class P07_VendingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);
                if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                    sum += coin;
                } else {
                    System.out.printf("Cannot accept %.2f\n", coin);
                }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        double price = 0;
        boolean isInvalid = false;

        while (!product.equals("End")) {

            switch (product) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    isInvalid = true;
                    break;
            }

            if (!isInvalid) {
                if (price <= sum) {
                    System.out.println("Purchased " + product);
                    sum -= price;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            }

            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);

    }
}

//100/100