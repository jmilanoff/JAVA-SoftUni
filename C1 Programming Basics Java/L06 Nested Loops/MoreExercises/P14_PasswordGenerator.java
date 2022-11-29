package L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P14_PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 'a'; c <= 'a' + l - 1; c++) {
                    for (int d = 'a'; d <= 'a' + l - 1; d++) {
                        for (int e = 1; e <= n; e++) {
                            if (e <= a || e <= b) {
                                continue; //⚠️ не break, а continue - не си извъртял loop-а
                            }
                            System.out.printf("%d%d%c%c%d ", a, b, c, d, e);
                        }
                    }
                }
            }
        }
    }
}

//100/100