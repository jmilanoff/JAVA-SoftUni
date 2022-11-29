package L1_BasicSyntax.Exercise;

import java.util.Scanner;

public class P06_StrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String numText = "" + num;
        int totalFactorial = 0;

        for (int i = 0; i < numText.length(); i++) {
            int currentDigit = Integer.parseInt("" + numText.charAt(i));
            int factorialCurrentDigit = 1;

            for (int j = 1; j <= currentDigit; j++) {
                factorialCurrentDigit *= j;
            }
            totalFactorial += factorialCurrentDigit;
        }

        if (totalFactorial == num) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}

//100/100

// ДРУГО РЕШЕНИЕ (по-лесно) ⚠️:

// while (num > 0) {
// int lastDigit = num % 10; (= find last digit)
    // find factorial
    // add factorial to sum
// num = num / 10; (= remove last digit)
// }
