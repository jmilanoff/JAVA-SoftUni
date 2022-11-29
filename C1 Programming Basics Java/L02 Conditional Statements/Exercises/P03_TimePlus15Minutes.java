package L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P03_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hours * 60 + minutes + 15;
        int newHours = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;

        if (newHours > 23) {
            newHours = 0;
        }

        if (newMinutes < 10) {
            System.out.printf("%d:0%d", newHours, newMinutes);
        } else {
            System.out.printf("%d:%d", newHours, newMinutes);

        }
    }
}

