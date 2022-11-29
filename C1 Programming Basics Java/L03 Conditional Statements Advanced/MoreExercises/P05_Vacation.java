package L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P05_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        String destination = "";
        String accommodation = "";

        if (budget <= 1000) {
            accommodation = "Camp";
            switch (season) {
                case "Summer":
                    destination = "Alaska";
                    price = budget * 0.65;
                    break;
                case "Winter":
                    destination = "Morocco";
                    price = budget * 0.45;
                    break;
            }
        } else if (budget > 1000 && budget <= 3000) {
            accommodation = "Hut";
            switch (season) {
                case "Summer":
                    destination = "Alaska";
                    price = budget * 0.80;
                    break;
                case "Winter":
                    destination = "Morocco";
                    price = budget * 0.60;
                    break;
            }
        } else if (budget > 3000) {
            accommodation = "Hotel";
            switch (season) {
                case "Summer":
                    destination = "Alaska";
                    price = budget * 0.90;
                    break;
                case "Winter":
                    destination = "Morocco";
                    price = budget * 0.90;
                    break;
            }
        }
        System.out.printf("%s - %s - %.2f", destination, accommodation, price);
    }
}

// 100/100