package L08_OldExams.E2_April2019_1;

import java.util.Scanner;

public class P06_CinemaTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();

        int student = 0;
        int standard = 0;
        int kids = 0;
        int totalTickets = 0;

        while (!movie.equals("Finish")) {
            int capacity = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int currentTickets = 0;

                while (!ticketType.equals("End")) {
                    switch (ticketType) {
                        case "student":
                            student++;
                            break;
                        case "standard":
                            standard++;
                            break;
                        case "kid":
                            kids++;
                            break;
                    }
                    currentTickets++;
                    totalTickets++;
                    if (currentTickets == capacity) {
                        break;
                    }
                    ticketType = scanner.nextLine();
                }
                System.out.printf("%s - %.2f%% full.\n", movie, 1.0 * currentTickets / capacity * 100);
                movie = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", 1.0 * student / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", 1.0 * standard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.\n", 1.0 * kids / totalTickets * 100);
    }
}

//100/100