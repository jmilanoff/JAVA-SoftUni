package L08_OldExams.E3_April2019_2;

import java.util.Scanner;

public class P02_EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double kozunaks = Math.ceil(guests / 3.0);
        double eggs = guests * 2;

        double kozunakPrice = 4;
        double eggPrice = 0.45;

        double bill = kozunaks * kozunakPrice + eggs * eggPrice;

        if (bill <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n", kozunaks, eggs);
            System.out.printf("He has %.2f lv. left.", budget - bill);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", bill - budget);
        }
    }
}

//100/100