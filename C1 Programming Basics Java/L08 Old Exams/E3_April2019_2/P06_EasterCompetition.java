package L08_OldExams.E3_April2019_2;

import java.util.Scanner;

public class P06_EasterCompetition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chefs = Integer.parseInt(scanner.nextLine());;

        int maxPoints = 0;
        String newLeader = "";

        for (int i = 1; i <= chefs; i++) {

            String currentChef = scanner.nextLine();
            String input = scanner.nextLine();
            int chefPoints = 0;

            while (!input.equals("Stop")) {
                int grade = Integer.parseInt(input);
                chefPoints += grade;
                if (chefPoints > maxPoints) {
                    maxPoints = chefPoints;
                    newLeader = currentChef;
                }
                input = scanner.nextLine();
            }

            System.out.printf("%s has %d points.\n", currentChef, chefPoints);
            if (newLeader.equals(currentChef)) {
                System.out.printf("%s is the new number 1!\n", currentChef);
            }

        }

        System.out.printf("%s won competition with %d points!", newLeader, maxPoints);
    }
}

//100/100