package L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P01_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player1 = Integer.parseInt(scanner.nextLine());
        int player2 = Integer.parseInt(scanner.nextLine());
        int player3 = Integer.parseInt(scanner.nextLine());

        int sumSeconds = player1 + player2 + player3;
        int minutes = sumSeconds / 60;
        int seconds = sumSeconds % 60;

//       ALTERNATIVE (my first idea)
//        if (seconds < 10) {
//            System.out.printf(minutes + ":" + "0" + seconds);
//        } else {
//            System.out.printf(minutes + ":" + seconds);

        // the teacher's way:

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
