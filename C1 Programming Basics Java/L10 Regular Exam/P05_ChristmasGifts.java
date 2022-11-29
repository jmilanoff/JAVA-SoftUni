package L10_RegularExam;

import java.util.Scanner;

public class P05_ChristmasGifts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int countKids = 0;
        int countAdults = 0;
        int countToys = 0;
        int countSweaters = 0;

        while (!input.equals("Christmas")) {
            int age = Integer.parseInt(input);
                if (age < 17) {
                    countKids++;
                    countToys++;
                } else {
                    countAdults++;
                    countSweaters++;
                }
            input = scanner.nextLine();
        }

        System.out.printf("Number of adults: %d\n", countAdults);
        System.out.printf("Number of kids: %d\n", countKids);
        System.out.printf("Money for toys: %d\n", countToys * 5);
        System.out.printf("Money for sweaters: %d\n", countSweaters * 15);
    }
}

//100/100