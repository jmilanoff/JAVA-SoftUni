package L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P10_Profit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coins1 = Integer.parseInt(scanner.nextLine());
        int coins2 = Integer.parseInt(scanner.nextLine());
        int bills5 = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (int ones = 0; ones <= coins1; ones++) {
            for (int twos = 0; twos <= coins2; twos++) {
                for (int fives = 0; fives <= bills5; fives++) {
                    if (ones + twos * 2 + fives * 5 == sum) {
                        count++;
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", ones, twos, fives, sum);
                    }
                }
            }
        }
    }
}

//100/100