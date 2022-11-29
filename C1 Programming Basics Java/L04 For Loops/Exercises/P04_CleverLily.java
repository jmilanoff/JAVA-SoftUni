package L04_ForLoops.Exercises;

import java.util.Scanner;

public class P04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundryMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int savedSum = 0;
        int toys = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savedSum += (i / 2 * 10) - 1;
            } else {
                toys++;
            }
        }
        int toysSum = toys * toyPrice;
        int finalSum = savedSum + toysSum;

        if (finalSum >= laundryMachinePrice) {
            System.out.printf("Yes! %.2f%n", (finalSum - laundryMachinePrice));
        } else {
            System.out.printf("No! %.2f", (laundryMachinePrice - finalSum));
        }
    }
}

//100/100