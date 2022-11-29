package L08_OldExams.E6_July2019;

import java.util.Scanner;

public class P05_FootballTournament {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        int totalGames = Integer.parseInt(scanner.nextLine());
        int countGames = 0;

        int countW = 0;
        int countD = 0;
        int countL = 0;
        int points = 0;

        while (countGames < totalGames) {
            countGames++;
            String result = scanner.nextLine();

            switch (result) {
                case "W":
                    countW++;
                    points += 3;
                    break;
                case "D":
                    countD++;
                    points += 1;
                    break;
                case "L":
                    countL++;
                    break;
            }

            if (countGames == totalGames) {
                break;
            }
        }

        if (countGames == 0) {
            System.out.printf("%s hasn't played any totalGames during this season.", team);
        }

        if (countGames > 0) {

        System.out.printf("%s has won %d points during this season.\n", team, points);
        System.out.println("Total stats:");
        System.out.printf("## W: %d\n", countW);
        System.out.printf("## D: %d\n", countD);
        System.out.printf("## L: %d\n", countL);
        System.out.printf("Win rate: %.2f%%", 1.0 * countW / totalGames * 100);

        }

    }
}

//100/100