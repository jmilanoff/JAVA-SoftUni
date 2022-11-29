package L08_OldExams.E1_March2019;

import java.util.Scanner;

public class P06_HighJump_ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endGoal = Integer.parseInt(scanner.nextLine());
        int currentJump = Integer.parseInt(scanner.nextLine());
        int currentGoal = endGoal - 30;
        int fails = 0;
        int jumps = 0;

        while (currentJump <= endGoal) {
            if (currentJump > currentGoal) {
                jumps++;
                currentGoal += 5;
                fails = 0;
                currentJump = Integer.parseInt(scanner.nextLine());
                continue;
            } else {
                jumps++;
                fails++;
                if (fails == 3) {
                    System.out.printf("Tihomir failed at %dcm after %d jumps.", currentGoal, jumps);
                    break;
                }
                currentJump = Integer.parseInt(scanner.nextLine());
            }

        }

        if (fails < 3) {
            jumps++;
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", currentGoal, jumps);
        }
    }
}


// 70/100, не пише защо