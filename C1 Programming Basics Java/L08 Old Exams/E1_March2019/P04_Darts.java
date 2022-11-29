package L08_OldExams.E1_March2019;

import java.util.Scanner;

public class P04_Darts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();
        int totalPoints = 301;
        int goodShots = 0;
        int badShots = 0;

        for (int i = 1; i > 0 ; i++) {
            String type = scanner.nextLine();

            if (type.equals("Retire")) {
                System.out.printf("%s retired after %d unsuccessful shots.", player, badShots);
                break;
            }

            int points = Integer.parseInt(scanner.nextLine());
                switch (type) {
                    case "Double":
                        points *= 2;
                        break;
                    case "Triple":
                        points *= 3;
                        break;
                }

            if (points < totalPoints) {
                totalPoints -= points;
                goodShots++;
            } else if (points == totalPoints) {
                goodShots++;
                System.out.printf("%s won the leg with %d shots.", player, goodShots);
                break;
            } else {
                badShots++;
            }

        }

    }
}

//100/100 (⚠️ бях забравил да сложа break след като играчът спечели играта)