package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                int sum = num1 + num2;
                if (sum % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", num1, num2, sum);
                } else {
                    System.out.printf("%d + %d = %d - odd", num1, num2, sum);
                }
                break;
            case "-":
                int sub = num1 - num2;
                if (sub % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", num1, num2, sub);
                } else {
                    System.out.printf("%d - %d = %d - odd", num1, num2, sub);
                }
                break;
            case "*":
                int mul = num1 * num2;
                if (mul % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", num1, num2, mul);
                } else {
                    System.out.printf("%d * %d = %d - odd", num1, num2, mul);
                }
                break;
            case "/":
                double div = num1 * 1.0 / num2;
                if (num2 != 0) {
                    System.out.printf("%d / %d = %.2f", num1, num2, div);
                } else {
                    System.out.printf("Cannot divide %d by zero", num1);
                }
                break;
            case "%":
                if (num2 != 0) {
                    int left = num1 % num2;
                    System.out.printf("%d %% %d = %d", num1, num2, left);
                } else {
                    System.out.printf("Cannot divide %d by zero", num1);
                    break;
                }
        }
    }
}
