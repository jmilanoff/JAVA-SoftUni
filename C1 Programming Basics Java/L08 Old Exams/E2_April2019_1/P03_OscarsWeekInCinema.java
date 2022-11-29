package L08_OldExams.E2_April2019_1;

import java.util.Scanner;

public class P03_OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmName = scanner.nextLine();
        String hallType = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;

        switch (filmName) {
            case "A Star Is Born":
                if (hallType.equals("normal")) {
                    ticketPrice = 7.50;
                } else if (hallType.equals("luxury")) {
                    ticketPrice = 10.50;
                } else if (hallType.equals("ultra luxury")) {
                    ticketPrice = 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (hallType.equals("normal")) {
                    ticketPrice = 7.35;
                } else if (hallType.equals("luxury")) {
                    ticketPrice = 9.45;
                } else if (hallType.equals("ultra luxury")) {
                    ticketPrice = 12.75;
                }
                break;
            case "Green Book":
                if (hallType.equals("normal")) {
                    ticketPrice = 8.15;
                } else if (hallType.equals("luxury")) {
                    ticketPrice = 10.25;
                } else if (hallType.equals("ultra luxury")) {
                    ticketPrice = 13.25;
                }
                break;
            case "The Favourite":
                if (hallType.equals("normal")) {
                    ticketPrice = 8.75;
                } else if (hallType.equals("luxury")) {
                    ticketPrice = 11.55;
                } else if (hallType.equals("ultra luxury")) {
                    ticketPrice = 13.95;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.", filmName, tickets * ticketPrice);
    }
}

//100/100