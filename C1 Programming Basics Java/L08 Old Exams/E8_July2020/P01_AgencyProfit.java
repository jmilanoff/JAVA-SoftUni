package L08_OldExams.E8_July2020;

import java.util.Scanner;

public class P01_AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String company = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int childTickets = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double servicePrice = Double.parseDouble(scanner.nextLine());

        double childTicketPrice = adultTicketPrice * 0.3;

        double profit = 0.2 * ((adultTicketPrice + servicePrice) * adultTickets + (childTicketPrice + servicePrice) * childTickets);

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", company, profit);

    }
}

//100/100
