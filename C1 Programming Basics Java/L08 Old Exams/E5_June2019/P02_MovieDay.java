package L08_OldExams.E5_June2019;

import java.util.Scanner;

public class P02_MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shootingTime = Integer.parseInt(scanner.nextLine());
        int numberOfScenes = Integer.parseInt(scanner.nextLine());
        int minutesPerScene = Integer.parseInt(scanner.nextLine());

        double setPrep = shootingTime * 0.15;
        double timeNeeded = numberOfScenes * minutesPerScene + setPrep;

        if (shootingTime > timeNeeded) {
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!", Math.round(shootingTime - timeNeeded));
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.", Math.round(timeNeeded - shootingTime));
        }
    }
}

//100/100