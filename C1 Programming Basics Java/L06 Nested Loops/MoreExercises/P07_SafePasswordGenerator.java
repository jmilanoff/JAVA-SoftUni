package L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P07_SafePasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());
        int countPasswords = 0;

        char A = '#';
        char B = '@';
        boolean exceedsMax = false;

        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b; y++) {
                countPasswords++;

                if (countPasswords > maxPasswords || countPasswords > a * b) {
                    exceedsMax = true;
                    break;
                }

                System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);

                A++;
                if (A > 55) {
                    A = 35;
                }
                B++;
                if (B > 96) {
                    B = 64;
                }


            }
            if (exceedsMax) {
                break;
            }
        }
    }
}

//100/100 (⚠️ много подвеждаща, A и B нямат нужда от loops, камо ли по 2 всеки) - реши пак!