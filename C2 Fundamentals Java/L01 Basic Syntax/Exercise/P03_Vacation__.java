package L1_BasicSyntax.Exercise;

import java.util.Scanner;

public class P03_Vacation__ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (day) {
            case "Friday":
                if (type.equals("Students")) {
                    price = 8.45;
                } else if (type.equals("Business")) {
                    price = 10.90;
                } else if (type.equals("Regular")){
                    price = 15;
                }
                break;
            case "Saturday":
                if (type.equals("Students")) {
                    price = 9.80;
                } else if (type.equals("Business")) {
                    price = 15.60;
                } else if (type.equals("Regular")){
                    price = 20;
                }
                break;
            case "Sunday":
                if (type.equals("Students")) {
                    price = 10.46;
                } else if (type.equals("Business")) {
                    price = 16;
                } else if (type.equals("Regular")){
                    price = 22.50;
                }
                break;
        }

        double finalPrice = price * people;

        if (type.equals("Students") && people >= 30) {
            finalPrice = finalPrice * 0.85;
        }
        if (type.equals("Business") && people >= 100) {
            finalPrice = price * (people * 0.9);
        }
        if (type.equals("Regular") && people >= 10 && people <= 20) {
            finalPrice = finalPrice * 0.95;
        }

        System.out.printf("Total price: %.2f\n", finalPrice);
    }
}

//90/100 ⚠️ не пише защо