package L08_OldExams.E4_May2019;

import java.util.Scanner;

public class P05_DivisionWithoutRemainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (count < n) {
            count++;
            int number = Integer.parseInt(scanner.nextLine());

                if (number % 2 == 0) {
                    p1++;
                }
                if (number % 3 == 0) {
                    p2++;
                }
                if (number % 4 == 0) {
                    p3++;
                }

           if (count == n) {
               break;
           }
        }

        System.out.printf("%.2f%%\n", 1.0 * p1 / n * 100);
        System.out.printf("%.2f%%\n", 1.0 * p2 / n * 100);
        System.out.printf("%.2f%%", 1.0 * p3 / n * 100);
    }
}

//100/100