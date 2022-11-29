package L08_OldExams.E8_July2020;

import java.util.Scanner;

public class P05_BestPlayer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();

        int maxGoals = 0;
        String bestPlayer = "";
        boolean hattrick = false;

        while (!player.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
                if (goals > maxGoals) {
                    maxGoals = goals;
                    bestPlayer = player;
                }
                if (goals >= 3) {
                    hattrick = true;
                }
                if (goals >= 10) {
                    break;
                }

            player = scanner.nextLine();
        }

        System.out.printf("%s is the best player!\n", bestPlayer);
        if (hattrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.", maxGoals);
        }

    }
}

//100/100