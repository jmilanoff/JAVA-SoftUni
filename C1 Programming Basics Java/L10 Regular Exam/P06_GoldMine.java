package L10_RegularExam;

import java.util.Scanner;

public class P06_GoldMine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());
        int countLocations = 0;

        while (countLocations != locations) {
            countLocations++;

            double expectedGold = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());

            double totalGold = 0;

            for (int i = 1; i <= days; i++) {
                double dailyGold = Double.parseDouble(scanner.nextLine());
                totalGold += dailyGold;
            }

            if (totalGold / days >= expectedGold) {
                System.out.printf("Good job! Average gold per day: %.2f.\n", totalGold / days);
            } else {
                System.out.printf("You need %.2f gold.\n", expectedGold - (totalGold / days));
            }
        }
    }
}

//100/100