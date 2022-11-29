package L06_NestedLoops.Exercises;

import java.util.Scanner;

public class P02_EqualSumsEvenOddPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            String currentNum = "" + i;
            int oddSum = 0;
            int evenSum = 0;

            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j)); //⚠️️️
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }

            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }

        }

    }
}

//100/100 (⚠️преобразуването от буква в int цифра не го знаех)