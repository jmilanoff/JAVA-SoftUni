package L05_WhileLoops.Lab;

import java.util.Scanner;

public class P08_Graduation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();

        double totalScore = 0;
        int countGrades = 0;
        int badGrades = 0;

        while (countGrades < 12) {
            double currentGrade = Double.parseDouble(scanner.nextLine());
                if (currentGrade >= 4) {
                    countGrades++;
                    totalScore += currentGrade;
                } else {
                    badGrades++;
                        if (badGrades >= 2) {
                            System.out.printf("%s has been excluded at %d grade", student, countGrades + 1);
                            break;
                        }
                }
        }

        if (countGrades == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", student, totalScore / 12);
        }
    }
}

//100/100