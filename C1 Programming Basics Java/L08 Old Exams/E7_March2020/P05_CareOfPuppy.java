package L08_OldExams.E7_March2020;

import java.util.Scanner;

public class P05_CareOfPuppy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = Integer.parseInt(scanner.nextLine());
        int foodInGr = food * 1000;
        int eaten = 0;

        String input = scanner.nextLine();

        while (!input.equals("Adopted")) {
            int quantity = Integer.parseInt(input);
            eaten += quantity;

            input = scanner.nextLine();
        }

        if (eaten <= foodInGr) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGr - eaten);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", eaten - foodInGr);
        }

    }
}

//100/100