package L08_OldExams.E1_March2019;

import java.util.Scanner;

public class P05_TennisRanklist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int totalPoints = initialPoints;
        int count = 0;
        int wins = 0;

        while (count < tournaments) {
            count++;
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    wins++;
                    totalPoints += 2000;
                    break;
                case "F":
                    totalPoints += 1200;
                    break;
                case "SF":
                    totalPoints += 720;
                    break;
            }

            if (count == tournaments) {
                break;
            }
        }

        int tournamentPoints = totalPoints - initialPoints;

        System.out.printf("Final points: %d\n", totalPoints);
        System.out.printf("Average points: %.0f\n", Math.floor(1.0 * tournamentPoints / tournaments));
        System.out.printf("%.2f%%", 1.0 * wins / tournaments * 100);

    }
}

//100/100