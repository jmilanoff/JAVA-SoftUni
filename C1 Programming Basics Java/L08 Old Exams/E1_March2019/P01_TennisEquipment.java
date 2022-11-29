package L08_OldExams.E1_March2019;

import java.util.Scanner;

public class P01_TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double racquetPrice = Double.parseDouble(scanner.nextLine());
        int racquets = Integer.parseInt(scanner.nextLine());
        int sneakers = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = racquetPrice / 6;
        double outfitPrice = (racquetPrice * racquets + sneakersPrice * sneakers) * 0.2;

        double totalSpend = (racquetPrice * racquets + sneakersPrice * sneakers + outfitPrice);

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(totalSpend / 8));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(totalSpend * 7 / 8));

    }
}

//100/100