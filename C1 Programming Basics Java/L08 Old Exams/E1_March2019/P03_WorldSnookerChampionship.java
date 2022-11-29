package L08_OldExams.E1_March2019;

import java.util.Scanner;

public class P03_WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int numberOfTickets = Integer.parseInt(scanner.nextLine());
        char photo = scanner.next().charAt(0); //⚠️

        double ticketPrice = 0;

        switch (stage) {
            case "Quarter final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 55.50;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 105.20;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 118.90;
                }
                break;
            case "Semi final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 75.88;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 125.22;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 300.40;
                }
                break;
            case "Final":
                if (ticketType.equals("Standard")) {
                    ticketPrice = 110.10;
                } else if (ticketType.equals("Premium")) {
                    ticketPrice = 160.66;
                } else if (ticketType.equals("VIP")) {
                    ticketPrice = 400;
                }
                break;
        }

        double bill = ticketPrice * numberOfTickets;

        if (bill <= 2500) {
            if (photo == 'Y') {
                bill = bill + numberOfTickets * 40;
            }
        } else if (bill > 2500 & bill <= 4000) {
            bill = bill * 0.9;
                if (photo == 'Y') {
                    bill = bill + numberOfTickets * 40;
            }
        } else if (bill > 4000) {
            bill = bill * 0.75;
        }

        System.out.printf("%.2f", bill);
    }
}

// 100/100 (⚠️ бях забравил да опиша случая когато билетите са <=2500 и има снимка с трофея)