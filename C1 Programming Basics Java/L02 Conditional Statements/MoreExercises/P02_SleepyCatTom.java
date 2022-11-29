package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P02_SleepyCatTom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holidays = Integer.parseInt(scanner.nextLine());

        int playtime = holidays * 127 + (365 - holidays) * 63;
        int diff = 30000 - playtime;
        int diffHours = diff / 60;
        int diffMinutes = diff % 60;

        if (diff < 0) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", Math.abs(diffHours), Math.abs(diffMinutes));
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", diffHours, diffMinutes);
        }

    }
}
