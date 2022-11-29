package L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int P = Integer.parseInt(scanner.nextLine());

        double sumN = N * 250;
        double priceM = sumN * 0.35;
        double priceP = sumN * 0.10;

        double sum = sumN + priceM * M + priceP * P;

        if (N > M) {
            sum = sum * 0.85;
        }

        if (budget >= sum) {
            System.out.printf("You have %.2f leva left!", budget - sum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", sum - budget);
        }

    }
}
