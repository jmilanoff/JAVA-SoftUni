package L04_ForLoops.MoreExercises;

import java.util.Scanner;

public class P05_GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int turns = Integer.parseInt(scanner.nextLine());

        double result = 0;

        int aNumbers = 0;
        int bNumbers = 0;
        int cNumbers = 0;
        int dNumbers = 0;
        int eNumbers = 0;
        int fNumbers = 0;


        for (int i = 1; i <= turns ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
                if (number >= 0 && number <= 9) {
                    result += number * 0.2;
                    aNumbers++;
                } else if (number >= 10 && number <= 19) {
                    result += number * 0.3;
                    bNumbers++;
                } else if (number >= 20 && number <= 29) {
                    result += number * 0.4;
                    cNumbers++;
                } else if (number >= 30 && number <= 39) {
                    result += 50;
                    dNumbers++;
                } else if (number >= 40 && number <= 50) {
                    result += 100;
                    eNumbers++;
                } else {
                    result = result / 2;
                    fNumbers++;
                }
        }
        System.out.printf("%.2f\n", result);
        System.out.printf("From 0 to 9: %.2f%%\n", 1.0 * aNumbers / turns * 100);
        System.out.printf("From 10 to 19: %.2f%%\n", 1.0 * bNumbers / turns * 100);
        System.out.printf("From 20 to 29: %.2f%%\n", 1.0 * cNumbers / turns * 100);
        System.out.printf("From 30 to 39: %.2f%%\n", 1.0 * dNumbers / turns * 100);
        System.out.printf("From 40 to 50: %.2f%%\n", 1.0 * eNumbers / turns * 100);
        System.out.printf("Invalid numbers: %.2f%%\n", 1.0 * fNumbers / turns * 100);
    }
}

//100/100