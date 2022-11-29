package L04_ForLoops.Exercises;

import java.util.Scanner;

public class P06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorsName = scanner.nextLine();
        double initialPoints = Double.parseDouble(scanner.nextLine());
        int reviewers = Integer.parseInt(scanner.nextLine());

        double totalPoints = initialPoints;

        for (int i = 1; i <= reviewers; i++) {
            String reviewersName = scanner.nextLine();
            double reviewersPoints = Double.parseDouble(scanner.nextLine());

            totalPoints += reviewersName.length() * reviewersPoints / 2;

            if (totalPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorsName, totalPoints);
                break;
            }
        }

            if (totalPoints < 1250.5) {
                System.out.printf("Sorry, %s you need %.1f more!", actorsName, (1250.5 - totalPoints));
            }
    }
}

//100/100