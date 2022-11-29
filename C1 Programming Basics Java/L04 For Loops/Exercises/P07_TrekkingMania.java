package L04_ForLoops.Exercises;

import java.util.Scanner;

public class P07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int montBlanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 1; i <= groups ; i++) {
            int people = Integer.parseInt(scanner.nextLine());
                if (people < 6) {
                    musala += people;
                } else if (people < 13) {
                    montBlanc += people;
                } else if (people < 26) {
                    kilimanjaro += people;
                } else if (people < 41) {
                    k2 += people;
                } else {
                    everest += people;
                }
        }

        int totalClimbers = musala + montBlanc + kilimanjaro + k2 + everest;

        double musalaPercent = 1.0 * musala / totalClimbers * 100;
        double montBlancPercent = 1.0 * montBlanc / totalClimbers * 100;
        double kilimanjaroPercent = 1.0 * kilimanjaro / totalClimbers * 100;
        double k2Percent = 1.0 * k2 / totalClimbers * 100;
        double everestPercent = 1.0 * everest / totalClimbers * 100;

        System.out.printf("%.2f%%%n", musalaPercent);
        System.out.printf("%.2f%%%n", montBlancPercent);
        System.out.printf("%.2f%%%n", kilimanjaroPercent);
        System.out.printf("%.2f%%%n", k2Percent);
        System.out.printf("%.2f%%", everestPercent);
    }
}

//100/100