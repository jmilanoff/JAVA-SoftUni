package L08_OldExams.E8_July2020;

import java.util.Scanner;

public class P02_AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double luggagePrice = Double.parseDouble(scanner.nextLine());
        double luggageKg = Double.parseDouble(scanner.nextLine());
        int daysBeforeTrip = Integer.parseInt(scanner.nextLine());
        int piecesOfLuggage = Integer.parseInt(scanner.nextLine());

        if (luggageKg < 10) {
            luggagePrice = luggagePrice * 0.2;
        } else if (luggageKg >= 10 && luggageKg <= 20) {
            luggagePrice = luggagePrice * 0.5;
        }

        if (daysBeforeTrip > 30) {
            luggagePrice = luggagePrice * 1.1;
        } else if (daysBeforeTrip >= 7 && daysBeforeTrip <= 30) {
            luggagePrice = luggagePrice * 1.15;
        } else if (daysBeforeTrip < 7) {
            luggagePrice = luggagePrice * 1.4;
        }
        System.out.printf("The total price of bags is: %.2f lv.", luggagePrice * piecesOfLuggage);
    }
}

//100/100