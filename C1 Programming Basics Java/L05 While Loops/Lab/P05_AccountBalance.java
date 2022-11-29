package L05_WhileLoops.Lab;

import java.util.Scanner;

public class P05_AccountBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double balance = 0;

        while (!input.equals("NoMoreMoney")) {
            double debit = Double.parseDouble(input);
                if (debit >= 0) {
                    System.out.printf("Increase: %.2f\n", debit);
                    balance += debit;
                } else {
                    System.out.println("Invalid operation!");
                    break;
                }
            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", balance);
    }
}

//100/1001