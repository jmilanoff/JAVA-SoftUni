package L1_BasicSyntax.Exercise;

import java.util.Scanner;

public class P11_RageExpenses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        int counter = 0;
        int headsets = 0;
        int mouses = 0;
        int keyboards = 0;
        int displays = 0;

        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                headsets++;
            }

            if (i % 3 == 0) {
                mouses++;
            }

            if (i % 6 == 0) {
                keyboards++;
            }

            if (i % 12 == 0) {
                displays++;
            }

        }

        double expenses = priceHeadset * headsets + priceMouse * mouses + priceKeyboard * keyboards + priceDisplay * displays;

        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}

//100/100