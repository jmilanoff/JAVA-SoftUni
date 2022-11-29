package L08_OldExams.E5_June2019;

import java.util.Scanner;

public class P04_MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int turns = 1000000;
        double remainder = budget;
        double salary = 0;
        String actor = "";

        for (int i = 1; i <= turns; i++) {
            actor = scanner.nextLine();

            if (actor.equals("ACTION")) {
                System.out.printf("We are left with %.2f leva.", remainder);
                break;
            }

            if (actor.length() <= 15) {
                salary = Double.parseDouble(scanner.nextLine());
                if (salary > remainder) {
                    System.out.printf("We need %.2f leva for our actors.", salary - remainder);
                    break;
                }
            } else {
                salary = remainder * 0.2;
            }

            remainder -= salary;

        }

    }
}

//100/100 (много беше трудно да се сетя за условието "if (actor.equals("ACTION))