package L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P04_CarNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int d1 = start; d1 <= end ; d1++) {
            for (int d2 = start; d2 <= end; d2++) {
                for (int d3 = start; d3 <= end; d3++) {
                    for (int d4 = start; d4 <= end; d4++) {
                        if (d1 % 2 == 0 && d4 % 2 == 0 || d1 % 2 != 0 && d4 % 2 != 0) {
                            continue;
                        }
                        if (d1 < d4) {
                            continue;
                        }
                        if ((d2 + d3) % 2 == 0) {
                            System.out.printf("%d%d%d%d ", d1, d2, d3, d4);
                        }
                    }
                }
            }
        }
    }
}

//100/100