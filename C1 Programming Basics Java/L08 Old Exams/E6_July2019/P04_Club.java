package L08_OldExams.E6_July2019;

import java.util.Scanner;

public class P04_Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double desiredProfit = Double.parseDouble(scanner.nextLine());

        int turns = 1000000;
        double bill = 0;
        String cocktail = "";

        for (int i = 1; i <= turns; i++) {
            cocktail = scanner.nextLine();
                if (cocktail.equals("Party!")) {
                    break;
                }
            double number = Integer.parseInt(scanner.nextLine());
            double price = number * cocktail.length();
                    if (price % 2 != 0) {
                    price = price * 0.75;
                    }
            bill += price;

            if (bill >= desiredProfit) {
                break;
            }

        }

        if (cocktail.equals("Party!")) {
            System.out.printf("We need %.2f leva more.\n", desiredProfit - bill);
        } else if (bill >= desiredProfit) {
            System.out.println("Target acquired.");
        }
        System.out.printf("Club income - %.2f leva.", bill);

    }
}

//100/100