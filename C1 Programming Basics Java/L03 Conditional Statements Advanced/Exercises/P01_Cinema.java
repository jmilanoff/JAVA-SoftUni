package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P01_Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (type.equals ("Premiere")) {
            price = 12.00;
        } else if (type.equals("Normal")) {
            price = 7.50;
        } else if (type.equals("Discount")) {
            price = 5.00;
        }
        System.out.printf("%.2f leva", rows * columns * price);
    }
}
