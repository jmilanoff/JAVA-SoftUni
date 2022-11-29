package L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P02_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String raceType = scanner.nextLine();

        double juniorsIncome = 0;
        double seniorsIncome = 0;

       switch (raceType) {

           case "trail":
                   juniorsIncome = juniors * 5.50;
                   seniorsIncome = seniors * 7;
               break;
           case "cross-country":
               if (seniors + juniors < 50) {
                   juniorsIncome = juniors * 8;
                   seniorsIncome = seniors * 9.50;
               } else {
                   juniorsIncome = juniors * 8 * 0.75;
                   seniorsIncome = seniors * 9.50 * 0.75;
               }
               break;
           case "downhill":
                   juniorsIncome = juniors * 12.25;
                   seniorsIncome = seniors * 13.75;
               break;
           case "road":
                   juniorsIncome = juniors * 20;
                   seniorsIncome = seniors * 21.50;
               break;
               }

        System.out.printf("%.2f", (juniorsIncome + seniorsIncome) * 0.95);
    }
}

//100/100 (не бях прочел добре условието и бях написал повече код от нужното)