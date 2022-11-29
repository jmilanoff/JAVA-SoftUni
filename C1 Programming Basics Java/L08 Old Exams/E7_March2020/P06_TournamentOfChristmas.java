package L08_OldExams.E7_March2020;

import java.util.Scanner;

public class P06_TournamentOfChristmas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalRaised = 0;
        int daysWon = 0;
        int daysLost = 0;

        for (int i = 1; i <= days; i++) {
            int wins = 0;
            int losses = 0;
            double raisedToday = 0;

            String sport = scanner.nextLine();

            while (!sport.equals("Finish")) {
                String result = scanner.nextLine();

                switch (result) {
                    case "win":
                        wins++;
                        raisedToday += 20;
                        break;
                    case "lose":
                        losses++;
                        break;
                }

                sport = scanner.nextLine();
            }

            if (wins > losses) {
                totalRaised += raisedToday * 1.1;
                daysWon++;
            } else {
                daysLost++;
                totalRaised += raisedToday;
            }
        }
        if (daysWon > daysLost) {
            totalRaised *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalRaised);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalRaised);
        }
    }
}

//100/100 (⚠️ втори път! Внимавай дали си рестартирал променливите, които важат само за конкретната итерация на loop-a)