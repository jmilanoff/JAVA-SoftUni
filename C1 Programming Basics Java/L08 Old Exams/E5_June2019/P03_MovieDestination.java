package L08_OldExams.E5_June2019;

import java.util.Scanner;

public class P03_MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double pricePerDay = 0;

        switch (destination) {
            case "Dubai":
                if (season.equals("Winter")) {
                    pricePerDay = 45000 * 0.7;
                } else if (season.equals("Summer")) {
                    pricePerDay = 40000 * 0.7;
                }
                break;
            case "Sofia":
                if (season.equals("Winter")) {
                    pricePerDay = 17000 * 1.25;
                } else if (season.equals("Summer")) {
                    pricePerDay = 12500 * 1.25;
                }
                break;
            case "London":
                if (season.equals("Winter")) {
                    pricePerDay = 24000;
                } else if (season.equals("Summer")) {
                    pricePerDay = 20250;
                }
                break;
        }
        double totalPrice = pricePerDay * days;
        if (totalPrice < budget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("The director needs %.2f leva more!", totalPrice - budget);
        }
    }
}

//100/100