package L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P06_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());

        double pricePerKm = 0;
        double salary = 0;

        if (km <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    pricePerKm = 0.75;
                    salary = pricePerKm * km * 4;
                    break;
                case "Summer":
                    pricePerKm = 0.90;
                    salary = pricePerKm * km * 4;
                    break;
                case "Winter":
                    pricePerKm = 1.05;
                    salary = pricePerKm * km * 4;
                    break;
            }

        } else if (km > 5000 && km <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    pricePerKm = 0.95;
                    salary = pricePerKm * km * 4;
                    break;
                case "Summer":
                    pricePerKm = 1.10;
                    salary = pricePerKm * km * 4;
                    break;
                case "Winter":
                    pricePerKm = 1.25;
                    salary = pricePerKm * km * 4;
                    break;
            }

        } else if (km > 10000 && km <= 20000) {
                pricePerKm = 1.45;
                salary = pricePerKm * km * 4;
        }

        System.out.printf("%.2f", salary * 0.9);
    }
}

// 100/100