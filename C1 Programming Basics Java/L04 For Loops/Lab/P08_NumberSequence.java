package L04_ForLoops.Lab;

import java.util.Scanner;

public class P08_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int MaxNumber = Integer.MIN_VALUE;
        int MinNumber = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
                if (number > MaxNumber) {
                    MaxNumber = number;
                }

                if (number < MinNumber) {
                    MinNumber = number;
                }

        }
        System.out.printf("Max number: %d\n", MaxNumber);
        System.out.printf("Min number: %d", MinNumber);
    }
}

//100/100