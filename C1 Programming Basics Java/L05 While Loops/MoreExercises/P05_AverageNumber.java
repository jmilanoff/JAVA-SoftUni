package L05_WhileLoops.MoreExercises;

import java.util.Scanner;

public class P05_AverageNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }

        System.out.printf("%.2f", 1.0 * sum / n);

    }
}

//100/100