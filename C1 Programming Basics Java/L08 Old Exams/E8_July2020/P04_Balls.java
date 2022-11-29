package L08_OldExams.E8_July2020;

import java.util.Scanner;

public class P04_Balls {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double points = 0;

        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int black = 0;
        int other = 0;


        for (int i = 1; i <= n ; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    points += 5;
                    red++;
                    break;
                case "orange":
                    points += 10;
                    orange++;
                    break;
                case "yellow":
                    points += 15;
                    yellow++;
                    break;
                case "white":
                    points += 20;
                    white++;
                    break;
                case "black":
                    black++;
                    points = Math.floor(points / 2);
                    break;
                default:
                    other++;
                    break;
            }

        }

        System.out.printf("Total points: %.0f\n", points);
        System.out.printf("Red balls: %d\n", red);
        System.out.printf("Orange balls: %d\n", orange);
        System.out.printf("Yellow balls: %d\n", yellow);
        System.out.printf("White balls: %d\n", white);
        System.out.printf("Other colors picked: %d\n", other);
        System.out.printf("Divides from black balls: %d", black);

    }
}

//100/100