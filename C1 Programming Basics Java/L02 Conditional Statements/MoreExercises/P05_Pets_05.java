package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P05_Pets_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double dogFoodPerDay = Double.parseDouble(scanner.nextLine());
        double catFoodPerDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDay = Double.parseDouble(scanner.nextLine());

        double turtleFoodInKg = turtleFoodPerDay / 1000;
        double totalFoodNeeded = days * (dogFoodPerDay + catFoodPerDay + turtleFoodInKg);

        if (totalFoodNeeded <= leftFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(leftFood - totalFoodNeeded));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFoodNeeded - leftFood));
        }
    }
}
