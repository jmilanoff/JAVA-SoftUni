package L10_RegularExam;

import java.util.Scanner;

public class P02_BeerAndChips {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beers = Integer.parseInt(scanner.nextLine());
        int bagsOfChips = Integer.parseInt(scanner.nextLine());

        double beersBill = beers * 1.20;
        double bagsOfChipsBill = Math.ceil(beersBill * 0.45 * bagsOfChips);
        double totalBill = beersBill + bagsOfChipsBill;

        if (totalBill <= budget) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, budget - totalBill);
        } else {
            System.out.printf("%s needs %.2f more leva!", name, totalBill - budget);
        }
    }
}

//100/100