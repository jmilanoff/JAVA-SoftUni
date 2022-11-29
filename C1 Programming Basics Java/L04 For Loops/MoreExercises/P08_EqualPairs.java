package L04_ForLoops.MoreExercises;

import java.util.Scanner;

public class P08_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumOdd = 0;
        int sumEven = 0;
        int maxDiff = Integer.MIN_VALUE;
        boolean isEqual = true;
        int diff = 0;

        for (int i = 1; i <= n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            if (n < 2) {
                System.out.printf("Yes, value=%d", num1 + num2);
                break;
            }

            if (i % 2 != 0) {
                sumOdd = num1 + num2;
            } else {
                sumEven = num1 + num2;
            }

            if (i > 1) {
                if (sumOdd == sumEven) {
                    isEqual = true;
                } else {
                    isEqual = false;
                    diff = Math.abs(sumEven - sumOdd);
                    if (diff > maxDiff) {
                        maxDiff = diff;
                    }
                }
            }
        }
        if (n >= 2 && isEqual) {
            System.out.printf("Yes, value=%d", sumOdd);
        } else if (n >=2){
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}

//100/100, но не е съвсем вярно ⚠️

//примерно:
//3 (три двойки)
//1
//4
//5
//5
//4
//6
//Yes, value=10 (въпреки че първата двойка не е равна на другите) - не измислих начин да го реша