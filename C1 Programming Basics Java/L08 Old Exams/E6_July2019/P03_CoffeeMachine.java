package L08_OldExams.E6_July2019;

import java.util.Scanner;

public class P03_CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (sugar) {
            case "Without":
                if (drink.equals("Espresso")) {
                    price = 0.90;
                } else if (drink.equals("Cappuccino")) {
                    price = 1.00;
                } else if (drink.equals("Tea")) {
                    price = 0.50;
                }
                break;
            case "Normal":
                if (drink.equals("Espresso")) {
                    price = 1;
                } else if (drink.equals("Cappuccino")) {
                    price = 1.20;
                } else if (drink.equals("Tea")) {
                    price = 0.60;
                }
                break;
            case "Extra":
                if (drink.equals("Espresso")) {
                    price = 1.20;
                } else if (drink.equals("Cappuccino")) {
                    price = 1.60;
                } else if (drink.equals("Tea")) {
                    price = 0.70;
                }
                break;
        }

        if (sugar.equals("Without")) {
            price = price * 0.65;
        }

        if (drink.equals("Espresso") && count >= 5) {
            price = price * 0.75;
        }

        if (price * count > 15) {
            price = price * 0.8;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", count, drink, price * count);
    }
}

//100/100