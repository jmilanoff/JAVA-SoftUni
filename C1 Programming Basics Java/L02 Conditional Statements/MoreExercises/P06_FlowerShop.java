package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P06_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double orderNoTaxes = magnolias * 3.25 + hyacinths * 4.00 + roses * 3.50 + cacti * 8.00;
        double orderWithTaxes = orderNoTaxes * 0.95;

        if (orderWithTaxes > giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(orderWithTaxes - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - orderWithTaxes));
        }
    }
}

//90/100 точки. Защо?
