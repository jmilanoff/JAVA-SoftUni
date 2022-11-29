package L06_NestedLoops.Exercises;

import java.util.Scanner;

public class P04_TrainTheTrainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int reviewers = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();

        int countPresentations = 0;
        double totalScore = 0;

        while (!presentationName.equals("Finish")) {
            countPresentations ++;

            double currentPptScore = 0;

            for (int i = 1; i <= reviewers; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                currentPptScore += grade;

            }
            totalScore += currentPptScore;
            System.out.printf("%s - %.2f.\n", presentationName, currentPptScore / reviewers);
            presentationName = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", totalScore / (countPresentations * reviewers));
    }
}

//100/100