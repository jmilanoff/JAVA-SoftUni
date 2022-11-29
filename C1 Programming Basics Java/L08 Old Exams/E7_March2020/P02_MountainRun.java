package L08_OldExams.E7_March2020;

import java.util.Scanner;

public class P02_MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsPer1Meter = Double.parseDouble(scanner.nextLine());

        double slowdown = Math.floor(distance / 50) * 30;

        double result = distance * secondsPer1Meter + slowdown;

        if (result < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", result);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", result - record);
        }

    }
}

//100/100
