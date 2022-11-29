package L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchDuration = breakDuration / 8.0;
        double restDuration = breakDuration / 4.0;

        //double result = Math.ceil(episodeDuration + lunchDuration + restDuration);

        double watchTime = breakDuration - (lunchDuration + restDuration);

        if (watchTime >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(watchTime - episodeDuration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(episodeDuration - watchTime));
        }

    }
}