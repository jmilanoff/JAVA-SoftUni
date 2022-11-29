package L1_BasicSyntax.Exercise;

import java.util.Scanner;

public class P02_Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int biggestDiv = 0;

        if (num % 2 == 0) {
            biggestDiv = 2;
        }
        if (num % 3 == 0) {
            biggestDiv = 3;
        }
        if (num % 6 == 0) {
            biggestDiv = 6;
        }
        if (num % 7 == 0) {
            biggestDiv = 7;
        }
        if (num % 10 == 0) {
            biggestDiv = 10;
        }

        if (biggestDiv != 0) {
            System.out.printf("The number is divisible by %d", biggestDiv);
        } else {
            System.out.println("Not divisible");
        }
    }
}

//100/100