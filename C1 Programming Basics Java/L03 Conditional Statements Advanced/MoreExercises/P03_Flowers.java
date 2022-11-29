package L03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chris = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double chrisPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;

        double bouquetPrice = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                chrisPrice = 2.00;
                rosesPrice = 4.10;
                tulipsPrice = 2.50;
                bouquetPrice = chrisPrice * chris + rosesPrice * roses + tulipsPrice * tulips;
                break;
            case "Autumn":
            case "Winter":
                chrisPrice = 3.75;
                rosesPrice = 4.50;
                tulipsPrice = 4.15;
                bouquetPrice = chrisPrice * chris + rosesPrice * roses + tulipsPrice * tulips;
                break;
        }
        if (holiday.equals("Y")) {
            chrisPrice = chrisPrice * 1.15;
            rosesPrice = rosesPrice * 1.15;
            tulipsPrice = tulipsPrice * 1.15;
            bouquetPrice = chrisPrice * chris + rosesPrice * roses + tulipsPrice * tulips;
        }
        if (season.equals("Spring") && tulips > 7) {
            bouquetPrice = bouquetPrice * 0.95;
        }
        if (season.equals("Winter") && roses >= 10) {
            bouquetPrice = bouquetPrice * 0.9;
        }
        if ((chris + roses + tulips) > 20) {
            bouquetPrice = bouquetPrice * 0.8;
        }

        System.out.printf("%.2f", bouquetPrice + 2);
    }
}

// 100/100