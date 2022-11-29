package L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P05_ChallengeTheWedding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());

        int countDates = 0;
        boolean isReached = false;

        for (int m = 1; m <= men; m++) {
            for (int w = 1; w <= women; w++) {
                countDates++;
                if (countDates > maxTables) {
                    isReached = true;
                    break;
                }
                    System.out.printf("(%d <-> %d) ", m, w);
            }
            if (isReached) {
                break;
            }
        }
    }
}