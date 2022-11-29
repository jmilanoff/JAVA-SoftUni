package L05_WhileLoops.MoreExercises;

import java.util.Scanner;

public class P02_ReportSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int counter = 0;
        int donations = 0;

        int sumCash = 0;
        int sumCards = 0;
        int cashTransactions = 0;
        int cardTransactions = 0;

        while(!input.equals("End")) {
            int price = Integer.parseInt(input);
            counter++;

                if (counter % 2 != 0) { //cash
                    if (price > 100) {
                        System.out.println("Error in transaction!");
                    } else {
                        System.out.println("Product sold!");
                        donations += price;
                        sumCash += price;
                        cashTransactions++;
                            if (donations >= goal) {
                                System.out.printf("Average CS: %.2f\n", 1.0 * sumCash / cashTransactions);
                                System.out.printf("Average CC: %.2f", 1.0 * sumCards / cardTransactions);
                                break;
                            }
                    }

                } else { //card
                    if (price < 10) {
                        System.out.println("Error in transaction!");
                    } else {
                        System.out.println("Product sold!");
                        donations += price;
                        sumCards += price;
                        cardTransactions++;
                            if (donations >= goal) {
                                System.out.printf("Average CS: %.2f\n", 1.0 * sumCash / cashTransactions);
                                System.out.printf("Average CC: %.2f", 1.0 * sumCards / cardTransactions);
                                break;
                            }
                    }

                }

            input = scanner.nextLine();

        }

        if (input.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}

//100/100