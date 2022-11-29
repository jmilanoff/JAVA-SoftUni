package L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P07_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wallsArea = (x * x - 1.2 * 2) + (x * x) + 2 * (x * y - 1.5 * 1.5);
        double roofArea = 2 * x * h / 2 + 2 * x * y;

        double greenPaint = wallsArea / 3.4;
        double redPaint = roofArea / 4.3;

        String greenResult = String.format("%.2f", greenPaint);
        String redResult = String.format("%.2f", redPaint);

        System.out.println(greenResult);
        System.out.println(redResult);

    }
}
