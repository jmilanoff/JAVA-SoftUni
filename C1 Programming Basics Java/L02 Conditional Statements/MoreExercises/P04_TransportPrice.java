package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P04_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String DayOrNight = scanner.nextLine();

        double taxiPrice = 0;

        if (DayOrNight.equals("day")) {
            taxiPrice = 0.79;
        } else {
            taxiPrice = 0.90;
        }

        if (n < 20) {
            System.out.printf("%.2f", n * taxiPrice + 0.70);
        }
        else if (n < 100) {
            System.out.printf("%.2f", n * 0.09);
        } else {
            System.out.printf("%.2f", n * 0.06);
        }
            }
        }

