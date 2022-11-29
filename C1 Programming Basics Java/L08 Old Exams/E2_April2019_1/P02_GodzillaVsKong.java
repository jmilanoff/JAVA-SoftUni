package L08_OldExams.E2_April2019_1;

import java.util.Scanner;

public class P02_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double outfitPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;

        if (extras > 150) {
            outfitPrice = outfitPrice * 0.9;
        }

        double finalSum = decor + extras * outfitPrice;

        if (finalSum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", finalSum - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - finalSum);
        }
    }
}

//100/100