package L08_OldExams.E5_June2019;

import java.util.Scanner;

public class P05_Series {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int shows = Integer.parseInt(scanner.nextLine());

        int count = 0;
        double bill = 0;

        while (count < shows) {
            count++;
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            switch (name) {
                case "Thrones":
                    price = price / 2;
                    break;
                case "Lucifer":
                    price = price * 0.6;
                    break;
                case "Protector":
                    price = price * 0.7;
                    break;
                case "TotalDrama":
                    price = price * 0.8;
                    break;
                case "Area":
                    price = price * 0.9;
                    break;
            }

            bill += price;

            if (count == shows) {
                break;
            }
        }

        if (budget >= bill) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - bill);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", bill - budget);
        }

    }
}

//100/100