package L04_ForLoops.Exercises;

import java.util.Scanner;

public class P08_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int finalPoints = initialPoints;
        int tournamentsWon = 0;

        for (int i = 1; i <= tournaments; i++) {
            String phaseReached = scanner.nextLine();

            switch (phaseReached) {
                case "W":
                    finalPoints += 2000;
                    tournamentsWon++;
                    break;
                case "F":
                    finalPoints += 1200;
                    break;
                case "SF":
                    finalPoints += 720;
                    break;
            }
        }
        System.out.println("Final points: " + finalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor((1.0 * finalPoints - initialPoints) / tournaments));
        System.out.printf("%.2f%%", 1.0 * tournamentsWon / tournaments * 100);
    }
}

//100/100