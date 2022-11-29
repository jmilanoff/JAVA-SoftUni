package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();

        int nights = days - 1;
        double price = 0;

        switch (roomType) {
            case "room for one person":
                price = nights * 18.00;
                break;
            case "apartment":
                if (days < 10) {
                    price = nights * 25.00 * 0.7;
                } else if (days <= 15) {
                    price = nights * 25.00 * 0.65;
                } else {
                    price = nights * 25.00 * 0.5;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    price = nights * 35.00 * 0.9;
                } else if (days <= 15) {
                    price = nights * 35.00 * 0.85;
                } else {
                    price = nights * 35.00 * 0.8;
                }
                break;
        }
        if (review.equals("positive")) {
            price = price * 1.25;
        } else if (review.equals("negative")) {
            price = price * 0.9;
        }
        System.out.printf("%.2f", price);
    }
}
