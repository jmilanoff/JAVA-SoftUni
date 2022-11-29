package L08_OldExams.E1_March2019;

import java.util.Scanner;

public class P01_BasketballTournament {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournament = scanner.nextLine();

        int won = 0;
        int lost = 0;
        int totalgames = 0;

        while (!tournament.equals("End of tournaments")) {
            int n = Integer.parseInt(scanner.nextLine());
            int countGames = 0;

            for (int games = 1; games <= n; games++) {
                int pointsDesi = Integer.parseInt(scanner.nextLine());
                int pointsRival = Integer.parseInt(scanner.nextLine());
                countGames++;

                if (pointsDesi > pointsRival) {
                    won++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n", countGames, tournament, Math.abs(pointsDesi - pointsRival));
                } else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n", countGames, tournament, Math.abs(pointsDesi - pointsRival));
                    lost++;
                }
            }

            totalgames += n;
            tournament = scanner.nextLine();
        }

        System.out.printf("%.2f%% matches win\n", 1.0 * won / totalgames * 100);
        System.out.printf("%.2f%% matches lost\n", 1.0 * lost / totalgames * 100);
    }
}

//100/100