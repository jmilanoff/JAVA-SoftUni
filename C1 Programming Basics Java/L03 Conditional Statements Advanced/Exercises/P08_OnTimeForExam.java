package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P08_OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHours = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int newExamMins = examHours * 60 + examMinutes;
        int newArrivalMins = arrivalHours * 60 + arrivalMinutes;

        int difference = Math.abs(newExamMins - newArrivalMins);
        int diffHours = difference / 60;
        int diffMinutes = difference % 60;

        if (newArrivalMins > newExamMins) {
            System.out.println("Late");
            if (difference < 60) {
                System.out.printf("%d minutes after the start", difference);
            } else {
                System.out.printf("%d:%02d hours after the start", diffHours, diffMinutes);
            }
        }
        else {
            if (difference == 0) {
                System.out.println("On Time");
            } else if (difference <= 30) {
                System.out.println("On Time");
                System.out.printf("%d minutes before the start", difference);
            } else {
                System.out.println("Early");
                if (difference < 60) {
                    System.out.printf("%d minutes before the start", difference);
                } else {
                    System.out.printf("%d:%02d hours before the start", diffHours, diffMinutes);
                }
            }
        }

    }
}


// беше ти трудна, реши още 1-2 пъти от началото ⚠️