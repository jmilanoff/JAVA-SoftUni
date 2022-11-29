package L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double result = deposit + months * ((deposit * interestRate/100) / 12);

        System.out.println(result);

    }
}
