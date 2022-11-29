package L04_ForLoops.Lab;

import java.util.Scanner;

public class P09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            leftSum += number;
        }

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            rightSum += number;
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", rightSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(rightSum - leftSum));
        }
    }
}

//100/100 (бях хард-коднал 2, вместо да напиша n в условието на единия for-цикъл)