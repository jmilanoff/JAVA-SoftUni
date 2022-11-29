package L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P03_CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degrees = Double.parseDouble(scanner.nextLine());

        double formula = (degrees * 9/5) + 32;
        String result = String.format("%.2f", formula);

        System.out.println(result);
    }
}
