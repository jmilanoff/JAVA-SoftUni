package L08_OldExams.E3_April2019_2;

import java.util.Scanner;

public class P01_EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kozunaks = Integer.parseInt(scanner.nextLine());
        int eggCartons = Integer.parseInt(scanner.nextLine());
        int kgCookies = Integer.parseInt(scanner.nextLine());

        double eggPaintPrice = eggCartons * 12 * 0.15;
        double bill = kozunaks * 3.20 + eggCartons * 4.35 + kgCookies * 5.40 + eggPaintPrice;

        System.out.printf("%.2f", bill);

    }
}

//100/100