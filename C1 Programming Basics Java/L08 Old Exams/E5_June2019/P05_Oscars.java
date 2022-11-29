package L08_OldExams.E5_June2019;

import java.util.Scanner;

public class P05_Oscars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double initialPoints = Double.parseDouble(scanner.nextLine());
        int totalReviewers = Integer.parseInt(scanner.nextLine());

        int countReviewers = 0;
        double finalPoints = initialPoints;

        while (countReviewers < totalReviewers) {
            countReviewers++;

            String reviewerName = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            finalPoints += reviewerName.length() * points / 2;

            if (finalPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, finalPoints);
                break;
            }

            if (countReviewers == totalReviewers) {
                break;
            }
        }

        if (finalPoints <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - finalPoints);
        }

    }
}

//100/100