package L06_NestedLoops.Exercises;

import java.util.Scanner;

public class P06_CinemaTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int totalTickets = 0;
        int totalStudent = 0;
        int totalStandard = 0;
        int totalKids = 0;

        while (!movie.equals("Finish")) {
            int capacity = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();

            int countSeats = 0;
            int student = 0;
            int standard = 0;
            int kid = 0;

            while (!ticketType.equals("End")) {
                    countSeats++;

                    if (ticketType.equals("standard")) {
                        standard++;
                    } else if (ticketType.equals("student")) {
                        student++;
                    } else if (ticketType.equals("kid")) {
                        kid++;
                    }

                    if (countSeats == capacity) {
                        break;
                    }
                    ticketType = scanner.nextLine();
                }

            totalTickets += countSeats;
            totalStudent += student;
            totalStandard += standard;
            totalKids += kid;

            System.out.printf("%s - %.2f%% full.\n", movie, 1.0 * countSeats / capacity * 100);
            movie = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", 1.0 * totalStudent / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", 1.0 * totalStandard / totalTickets* 100);
        System.out.printf("%.2f%% kids tickets.", 1.0 * totalKids / totalTickets * 100);

    }
}

//100/100