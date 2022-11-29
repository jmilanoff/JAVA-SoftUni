package L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P04_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String carType = "";
        double carPrice = 0;

        if (budget <= 100) {
            carClass = "Economy class";
            switch (season) {
                case "Summer":
                carType = "Cabrio";
                carPrice = budget * 0.35;
                break;
                case "Winter":
                carType = "Jeep";
                carPrice = budget * 0.65;
                break;
            }

        } else if (budget > 100 && budget <= 500) {
            carClass = "Compact class";
            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    carPrice = budget * 0.45;
                    break;
                case "Winter":
                    carType = "Jeep";
                    carPrice = budget * 0.8;
                    break;
            }

        } else if (budget > 500) {
            carClass = "Luxury class";
            carType = "Jeep";
            carPrice = budget * 0.9;
        }

        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}

//100/100