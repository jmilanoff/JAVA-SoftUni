package L08_OldExams.E1_March2019;

import java.util.Scanner;

public class P04_GameNumberWars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String p1 = scanner.nextLine();
        String p2 = scanner.nextLine();

        int p1Points = 0;
        int p2Points = 0;

        boolean isEqual = false;

        int p1Card = 0;
        int p2Card = 0;

        for (int i = 1; i > 0 ; i++) {
            String input = scanner.nextLine();

            if (input.equals("End of game")) {
                System.out.printf("%s has %d points\n", p1, p1Points);
                System.out.printf("%s has %d points", p2, p2Points);
                break;
            }

            p1Card = Integer.parseInt(input);
            p2Card = Integer.parseInt(scanner.nextLine());

            if (isEqual) {
                break;
            }

            if (p1Card == p2Card) {
                isEqual = true;
                System.out.println("Number wars!");
                continue;
            }

            if (p1Card > p2Card) {
                p1Points += (p1Card - p2Card);
            } else {
                p2Points += (p2Card - p1Card);
            }

        }

        if (isEqual) {

            if (p1Card > p2Card) {
                System.out.printf("%s is winner with %d points", p1, p1Points);
            } else if (p2Card > p1Card) {
                System.out.printf("%s is winner with %d points", p2, p2Points);
            }
        }

    }
}

//100/100