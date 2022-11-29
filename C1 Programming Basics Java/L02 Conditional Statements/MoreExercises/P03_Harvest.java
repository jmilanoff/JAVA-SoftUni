package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P03_Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = Integer.parseInt(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        int Z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrapes = X * Y;
        double usableGrapes = totalGrapes * 0.4;
        double wineQuantity = usableGrapes / 2.5;

        if (wineQuantity < Z) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(Z - wineQuantity));
        } else {
            double leftWine = wineQuantity - Z;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wineQuantity));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(leftWine), Math.ceil(leftWine / workers));
        }
    }
}
