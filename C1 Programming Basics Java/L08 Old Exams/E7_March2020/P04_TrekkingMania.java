package L08_OldExams.E7_March2020;

import java.util.Scanner;

public class P04_TrekkingMania {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int montBlanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;


        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            if (people <= 5) {
                musala += people;
            } else if (people <= 12) {
                montBlanc += people;
            } else if (people <= 25) {
                kilimanjaro += people;
            } else if (people <= 40) {
                k2 += people;
            } else {
                everest += people;

            }

        }

        int total = musala + montBlanc + kilimanjaro + k2 + everest;

        System.out.printf("%.2f%%\n", 1.0 * musala / total * 100);
        System.out.printf("%.2f%%\n", 1.0 * montBlanc / total * 100);
        System.out.printf("%.2f%%\n", 1.0 * kilimanjaro / total * 100);
        System.out.printf("%.2f%%\n", 1.0 * k2 / total * 100);
        System.out.printf("%.2f%%\n", 1.0 * everest / total * 100);
    }
}

//100/100