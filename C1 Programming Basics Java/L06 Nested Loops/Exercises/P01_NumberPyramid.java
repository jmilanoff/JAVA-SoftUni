package L06_NestedLoops.Exercises;

import java.util.Scanner;

public class P01_NumberPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;
        boolean isBigger = false;

        for (int row = 1; row <= n; row++) {
            for (int nums = 1; nums <= row; nums++) {
                System.out.print(current + " ");
                current++;

                if (current > n) {
                    isBigger = true;
                    break;
                }
            }
        if (isBigger) {
            break;
        }
        System.out.println();
        }

    }
}

//100/100 (⚠️беше учудващо трудно да се ориентирам, реши пак)