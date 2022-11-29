package L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P10_MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            double number = Double.parseDouble(scanner.nextLine());

                if (number >= 0) {
                    System.out.printf("Result: %.2f%n", number * 2);
                } else {
                    System.out.println("Negative number!");
                }
        }
    }
}