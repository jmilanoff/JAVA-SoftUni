package L08_OldExams.E3_April2019_2;

import java.util.Scanner;

public class P01_EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPrice = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggCartons = Integer.parseInt(scanner.nextLine());
        int yeastPacks = Integer.parseInt(scanner.nextLine());

        double sugarPrice = flourPrice * 0.75;
        double eggCartonPrice = flourPrice * 1.1;
        double yeastPackPrice = sugarPrice * 0.2;

        double bill = flourPrice * flourKg + sugarPrice * sugarKg + eggCartonPrice * eggCartons + yeastPackPrice * yeastPacks;

        System.out.printf("%.2f", bill);
    }
}

//100/100