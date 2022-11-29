package L06_NestedLoops.Exercises;

import java.util.Scanner;

public class P05_SpecialNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            String iText = "" + i;
            int d1 = Integer.parseInt("" + iText.charAt(0));
            int d2 = Integer.parseInt("" + iText.charAt(1));
            int d3 = Integer.parseInt("" + iText.charAt(2));
            int d4 = Integer.parseInt("" + iText.charAt(3));

            if (d1 == 0 || d2 == 0 || d3 == 0 || d4 == 0) {
                continue;
            }

            if (number % d1 == 0 && number % d2 == 0 && number % d3 == 0 && number % d4 == 0) {
                System.out.print(i + " ");
            }

        }

    }
}

//100/100