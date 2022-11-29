package L05_WhileLoops.MoreExercises;

import java.util.Scanner;

public class P01_Dishwasher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        int totalLiquid = bottles * 750;

        String input = scanner.nextLine();
        int plates = 0;
        int pots = 0;

        int countTurns = 0;

        int remainder = totalLiquid;

        while (!input.equals("End")) {
            int dishes = Integer.parseInt(input);
            countTurns++;
            int neededLiquid = 0;

            if (countTurns % 3 == 0) {
                neededLiquid = dishes * 15;
                if (neededLiquid > remainder) {
                    System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(neededLiquid - remainder));
                    break;
                }
                pots += dishes;
                remainder -= neededLiquid;

            } else {
                neededLiquid = dishes * 5;
                if (neededLiquid > remainder) {
                    System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(neededLiquid - remainder));
                    break;
                }
                plates += dishes;
                remainder -= neededLiquid;
            }

            input = scanner.nextLine();

        }

        if (input.equals("End")) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n", plates, pots);
            System.out.printf("Leftover detergent %d ml.", remainder);
        }
    }
}