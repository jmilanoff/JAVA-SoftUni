package L08_OldExams.E1_March2019;

import java.util.Scanner;

public class P02_Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int benchmarkMinutes = Integer.parseInt(scanner.nextLine());
        int benchmarkSeconds = Integer.parseInt(scanner.nextLine());
        double trackLength = Double.parseDouble(scanner.nextLine());
        int secondsPer100m = Integer.parseInt(scanner.nextLine());

        int newBenchmarkInSeconds = benchmarkMinutes * 60 + benchmarkSeconds;
        double slowdownInSeconds = (trackLength / 120) * 2.5;
        double resultInSeconds = (trackLength / 100) * secondsPer100m - slowdownInSeconds;

        if (resultInSeconds <= newBenchmarkInSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", resultInSeconds);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", resultInSeconds - newBenchmarkInSeconds);
        }
    }
}

//100/100