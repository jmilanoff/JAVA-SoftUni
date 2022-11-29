package L06_NestedLoops.Lab;

import java.util.Scanner;

public class P05_Travelling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            double saved = 0;

            while (saved < budget) {
                double sum = Double.parseDouble(scanner.nextLine());
                saved += sum;
                if (saved >= budget) {
                    System.out.printf("Going to %s!\n", destination);
                    break;
                }
            }

            destination = scanner.nextLine();

        }
    }
}

//100/100