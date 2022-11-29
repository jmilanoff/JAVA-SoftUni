package L08_OldExams.E7_March2020;

import java.util.Scanner;

public class P02_CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesPerWalk = Integer.parseInt(scanner.nextLine());
        int walks = Integer.parseInt(scanner.nextLine());
        int caloriesIntake = Integer.parseInt(scanner.nextLine());

        int caloriesSpent = (walks * minutesPerWalk) * 5;

        if (caloriesSpent >= caloriesIntake /2) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", caloriesSpent);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesSpent);
        }

    }
}

//100/100