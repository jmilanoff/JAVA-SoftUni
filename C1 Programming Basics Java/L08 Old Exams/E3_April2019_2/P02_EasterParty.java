package L08_OldExams.E3_April2019_2;

import java.util.Scanner;

public class P02_EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double feePrice = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double cakePrice = budget * 0.10;

        if (guests >= 10 && guests <= 15) {
            feePrice = feePrice * 0.85;
        } else if (guests > 15 && guests <= 20) {
            feePrice = feePrice * 0.8;
        } else if (guests > 20) {
            feePrice = feePrice * 0.75;
        }

        double bill = guests * feePrice + cakePrice;

        if (bill <= budget) {
            System.out.printf("It is party time! %.2f leva left.", budget - bill);
        } else {
            System.out.printf("No party! %.2f leva needed.", bill - budget);
        }

    }
}

//100/100