package L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P01_UniquePINCodes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upper1st = Integer.parseInt(scanner.nextLine());
        int upper2nd = Integer.parseInt(scanner.nextLine());
        int upper3rd = Integer.parseInt(scanner.nextLine());

        for (int first = 2; first <= upper1st; first++) {
            if (first % 2 != 0) {
                continue;
            }
            for (int second = 2; second <= upper2nd ; second++) {
                if (second == 4 || second == 6 || second == 8 || second == 9) {
                    continue;
                }
                for (int third = 2; third <= upper3rd; third++) {
                    if (third % 2 == 0) {
                        System.out.printf("%d %d %d\n", first, second, third);
                    }

                }

            }

        }

    }
}

//100/100 (харкоднал съм non-prime числата - ако диапазонът беше голям, тр с проверка дали се делят на др освен на 1 и себе си)