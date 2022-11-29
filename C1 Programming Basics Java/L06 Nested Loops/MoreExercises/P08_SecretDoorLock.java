package L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P08_SecretDoorLock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max100 = Integer.parseInt(scanner.nextLine());
        int max10 = Integer.parseInt(scanner.nextLine());
        int max1 = Integer.parseInt(scanner.nextLine());

        for (int d1 = 1; d1 <= max100; d1++) {
            if (d1 % 2 != 0) {
                continue;
            }
            for (int d2 = 2; d2 <= max10; d2++) {
                if (d2 == 4 || d2 == 6 || d2 == 8 || d2 ==9) {
                    continue;
                }
                for (int d3 = 1; d3 <= max1; d3++) {
                    if (d3 % 2 == 0) {
                        System.out.printf("%d %d %d\n", d1, d2, d3);
                    }
                }
            }
        }
    }
}

//100/100