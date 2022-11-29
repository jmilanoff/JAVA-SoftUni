package L03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P05_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //град / продукт coffee water beer sweets peanuts
        //Sofia          0.50   0.80  1.20  1.45   1.60
        //Plovdiv        0.40   0.70  1.15  1.30   1.50
        //Varna          0.45   0.70  1.10  1.35   1.55

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        switch (product) {
            case "coffee":
                switch (city) {
                    case "Sofia":
                        price = 0.50;
                        break;
                    case "Plovdiv":
                        price = 0.40;
                        break;
                    case "Varna":
                        price = 0.45;
                        break;
                }
                break;
            case "water":
                switch (city) {
                    case "Sofia":
                        price = 0.80;
                        break;
                    case "Plovdiv":
                        price = 0.70;
                        break;
                    case "Varna":
                        price = 0.70;
                        break;
                }
                break;
            case "beer":
                switch (city) {
                    case "Sofia":
                        price = 1.20;
                        break;
                    case "Plovdiv":
                        price = 1.15;
                        break;
                    case "Varna":
                        price = 1.10;
                        break;
                }
                break;
            case "sweets":
                switch (city) {
                    case "Sofia":
                        price = 1.45;
                        break;
                    case "Plovdiv":
                        price = 1.30;
                        break;
                    case "Varna":
                        price = 1.35;
                        break;
                }
                break;
            case "peanuts":
                switch (city) {
                    case "Sofia":
                        price = 1.60;
                        break;
                    case "Plovdiv":
                        price = 1.50;
                        break;
                    case "Varna":
                        price = 1.55;
                        break;
                }
                break;
        }

            System.out.println(price * quantity);

        }
    }
