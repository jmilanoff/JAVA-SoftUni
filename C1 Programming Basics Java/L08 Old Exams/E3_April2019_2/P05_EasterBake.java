package L08_OldExams.E3_April2019_2;

import java.util.Scanner;

public class P05_EasterBake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreads = Integer.parseInt(scanner.nextLine());
        int count = 0;

        int totalSugar = 0;
        int totalFlour = 0;

        int maxSugar = 0;
        int maxFlour = 0;

        while (count < easterBreads) {
            count++;
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            totalSugar += sugar;
            totalFlour += flour;

            if (sugar > maxSugar) {
                maxSugar = sugar;
            }

            if (flour > maxFlour) {
                maxFlour = flour;
            }

            if (count == easterBreads) {
                break;
            }
        }

        System.out.printf("Sugar: %.0f\n", Math.ceil(1.0 * totalSugar / 950));
        System.out.printf("Flour: %.0f\n", Math.ceil(1.0 * totalFlour / 750));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);

    }
}

//100/100