package L08_OldExams.E5_June2019;

import java.util.Scanner;

public class P03_FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String product = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (movie) {
            case "John Wick":
                switch (product) {
                    case "Drink":
                        price = 12;
                        break;
                    case "Popcorn":
                        price = 15;
                        break;
                    case "Menu":
                        price = 19;
                        break;
                }
                break;
            case "Jumanji":
                switch (product) {
                    case "Drink":
                        price = 9;
                        if (tickets == 2) {
                            price = price * 0.85;
                        }
                        break;
                    case "Popcorn":
                        price = 11;
                        if (tickets == 2) {
                            price = price * 0.85;
                        }
                        break;
                    case "Menu":
                        price = 14;
                        if (tickets == 2) {
                            price = price * 0.85;
                        }
                        break;
                }
                break;
            case "Star Wars":
                switch (product) {
                    case "Drink":
                        price = 18;
                        if (tickets >= 4) {
                            price = price * 0.7;
                        }
                        break;
                    case "Popcorn":
                        price = 25;
                        if (tickets >= 4) {
                            price = price * 0.7;
                        }
                        break;
                    case "Menu":
                        price = 30;
                        if (tickets >= 4) {
                            price = price * 0.7;
                        }
                        break;
                }
                break;
        }
        double bill = tickets * price;
        System.out.printf("Your bill is %.2f leva.", bill);
    }
}

//100/100