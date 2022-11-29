package L06_NestedLoops.Exercises;

import java.util.Scanner;

public class P03_SumPrimeNonPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            int divisions = 0;

            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {
                    divisions++;
                        if (divisions > 2) {
                            break;
                        }
                }

            }

            if (divisions > 2) {
                sumNonPrime += number;
            } else {
                sumPrime += number;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);

    }
}

//100/100