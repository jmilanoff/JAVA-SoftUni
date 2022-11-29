package L08_OldExams.E4_May2019;

import java.util.Scanner;

public class P03_MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String years = scanner.nextLine();
        String type = scanner.nextLine();
        String internet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double pricePerMonth = 0;

        switch (type) {
            case "Small":
                switch (years) {
                    case "one":
                        pricePerMonth = 9.98;
                        break;
                    case "two":
                        pricePerMonth = 8.58;
                        break;
                }
                break;
            case "Middle":
                switch (years) {
                    case "one":
                        pricePerMonth = 18.99;
                        break;
                    case "two":
                        pricePerMonth = 17.09;
                        break;
                }
                break;
            case "Large":
                switch (years) {
                    case "one":
                        pricePerMonth = 25.98;
                        break;
                    case "two":
                        pricePerMonth = 23.59;
                        break;
                }
                break;
            case "ExtraLarge":
                switch (years) {
                    case "one":
                        pricePerMonth = 35.99;
                        break;
                    case "two":
                        pricePerMonth = 31.79;
                        break;
                }
                break;
        }
        if (internet.equals("yes")) {
            if (pricePerMonth <= 10) {
                pricePerMonth = pricePerMonth + 5.5;
            } else if (pricePerMonth <= 30) {
                pricePerMonth = pricePerMonth + 4.35;
            } else {
                pricePerMonth = pricePerMonth + 3.85;
            }
        }

        double finalPrice = pricePerMonth * months;

        if (years.equals("two")) {
            finalPrice = finalPrice * ((100 - 3.75) / 100);
        }

        System.out.printf("%.2f lv.", finalPrice);
    }
}

//100/100