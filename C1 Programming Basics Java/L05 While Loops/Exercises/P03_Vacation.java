package L05_WhileLoops.Exercises;

import java.util.Scanner;

public class P03_Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        double balance = Double.parseDouble(scanner.nextLine());
        int countDays = 0;
        int spendingDays = 0;

        while (balance < tripPrice) {
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            countDays++;

            if (action.equals("spend")) {
                    if (sum > balance) {
                        balance = 0;
                     } else {
                        balance -= sum;
                    }
                spendingDays++;
                    if (spendingDays == 5) {
                        System.out.println("You can't save the money.");
                        System.out.println(countDays);
                        break;
                    }

            } else if (action.equals("save")) {
                balance += sum;
                spendingDays = 0;
            }

        }

        if (balance >= tripPrice) {
            System.out.printf("You saved the money for %d days.\n", countDays);
        }
    }
}