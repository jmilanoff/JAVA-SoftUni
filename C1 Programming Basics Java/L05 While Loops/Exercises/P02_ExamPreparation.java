package L05_WhileLoops.Exercises;

import java.util.Scanner;

public class P02_ExamPreparation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxFails = Integer.parseInt(scanner.nextLine());
        String currentProblem = scanner.nextLine();
        ;
        double totalScore = 0;
        int countProblems = 0;
        int poorGrades = 0;
        String lastProblem = "";

        while (!currentProblem.equals("Enough")) {
            int currentGrade = Integer.parseInt(scanner.nextLine());

            if (currentGrade <= 4) {
                poorGrades++;
                if (poorGrades >= maxFails) {
                    System.out.printf("You need a break, %d poor grades.", poorGrades);
                    break;
                }
            }

            countProblems++;
            totalScore += currentGrade;
            lastProblem = currentProblem;

            currentProblem = scanner.nextLine();
        }
            if (currentProblem.equals("Enough")) {
                System.out.printf("Average score: %.2f\n", totalScore / countProblems);
                System.out.printf("Number of problems: %d\n", countProblems);
                System.out.printf("Last problem: %s", lastProblem);
            }

    }
}

//100/100 (⚠️ когато слабите оценки станат колкото maxFails бях принтирал броя задачи, а не броя слаби оценки)


// АЛТЕРНАТИВНО РЕШЕНИЕ (с броят слаби оценки в while loop-a)

//    int maxFails = Integer.parseInt(scanner.nextLine());
//    String currentProblem = scanner.nextLine();
//
//    int countProblems = 0;
//    double totalScore = 0;
//    int poorGrades = 0;
//    String lastProblem = "";
//
//        while (poorGrades < maxFails) {
//
//        if (currentProblem.equals("Enough")) {
//        System.out.printf("Average score: %.2f\n", totalScore / countProblems);
//        System.out.printf("Number of problems: %d\n", countProblems);
//        System.out.printf("Last problem: %s", lastProblem);
//        break;
//        }
//
//        int currentGrade = Integer.parseInt(scanner.nextLine());
//
//        if (currentGrade <= 4) {
//        poorGrades++;
//        if (poorGrades >= maxFails) {
//        break;
//        }
//        }
//
//        countProblems++;
//        totalScore += currentGrade;
//        lastProblem = currentProblem;
//
//        currentProblem = scanner.nextLine();
//        }
//
//        if (poorGrades >= maxFails)
//        System.out.printf("You need a break, %d poor grades.", poorGrades);
//        }
//        }