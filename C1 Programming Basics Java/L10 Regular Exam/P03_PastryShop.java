package L10_RegularExam;

import java.util.Scanner;

public class P03_PastryShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dessertType = scanner.nextLine();
        int numberOfDeserts = Integer.parseInt(scanner.nextLine());
        int date = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (dessertType) {
            case "Cake":
                if (date >= 1 && date <= 15) {
                    price = 24;
                } else if (date <= 24){
                    price = 28.70;
                }
                break;
            case "Souffle":
                if (date >= 1 && date <= 15) {
                    price = 6.66;
                } else if (date <= 24){
                    price = 9.80;
                }
                break;
            case "Baklava":
                if (date >= 1 && date <= 15) {
                    price = 12.60;
                } else if (date <= 24){
                    price = 16.98;
                }
                break;
        }

        double bill = price * numberOfDeserts;

        if (date >= 1 && date <= 22) {
            if (bill >= 100 && bill <= 200) {
                bill = bill * 0.85;
            } else if (bill > 200) {
                bill = bill * 0.75;
            }
        }

        if (date >= 1 && date <= 15) {
            bill = bill * 0.9;
        }

        System.out.printf("%.2f", bill);

    }
}

//100/100