package L08_OldExams.E6_July2019;

import java.util.Scanner;

public class P05_PCGameShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesSold = Integer.parseInt(scanner.nextLine());
        int count = 0;

        int hearthstone = 0;
        int fornite = 0;
        int overwatch = 0;
        int others = 0;

        while (count < gamesSold) {
            count++;
            String game = scanner.nextLine();

            switch (game) {
                case "Hearthstone":
                    hearthstone++;
                    break;
                case "Fornite":
                    fornite++;
                    break;
                case "Overwatch":
                    overwatch++;
                    break;
                default:
                    others++;
                    break;
            }

            if (count == gamesSold) {
                break;
            }

        }

        System.out.printf("Hearthstone - %.2f%%\n", 1.0 * hearthstone / gamesSold * 100);
        System.out.printf("Fornite - %.2f%%\n", 1.0 * fornite / gamesSold * 100);
        System.out.printf("Overwatch - %.2f%%\n", 1.0 * overwatch / gamesSold * 100);
        System.out.printf("Others - %.2f%%", 1.0 * others / gamesSold * 100);

    }
}

//100/100