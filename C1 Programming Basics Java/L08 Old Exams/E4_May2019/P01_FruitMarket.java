package L08_OldExams.E4_May2019;

import java.util.Scanner;

public class P01_FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double raspberriesKg = Double.parseDouble(scanner.nextLine());
        double strawberriesKg = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = raspberriesPrice * 0.6;
        double bananasPrice = raspberriesPrice * 0.2;

        System.out.printf("%.2f", strawberriesPrice * strawberriesKg + bananasPrice * bananasKg + orangesPrice * orangesKg + raspberriesPrice * raspberriesKg);
    }
}

//100/100