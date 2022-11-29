package L04_ForLoops.MoreExercises;

import java.util.Scanner;

public class P04_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        int aStudents = 0;
        int bStudents = 0;
        int cStudents = 0;
        int dStudents = 0;

        double totalScore = 0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 2.00 && grade <= 2.99) {
                aStudents++;
                totalScore += grade;
            } else if (grade >= 3.00 && grade <= 3.99) {
                bStudents++;
                totalScore += grade;
            } else if (grade >= 4.00 && grade <= 4.99) {
                cStudents++;
                totalScore += grade;
            } else if (grade >= 5.00) {
                dStudents++;
                totalScore += grade;
            }
        }
        System.out.printf("Top students: %.2f%%\n", 1.0 * dStudents / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", 1.0 * cStudents / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", 1.0 * bStudents / students * 100);
        System.out.printf("Fail: %.2f%%\n", 1.0 * aStudents / students * 100);
        System.out.printf("Average: %.2f", totalScore / students);
    }
}

//100/100