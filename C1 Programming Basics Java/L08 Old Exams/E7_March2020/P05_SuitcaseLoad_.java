package L08_OldExams.E7_March2020;

import java.util.Scanner;

public class P05_SuitcaseLoad_ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCapacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        int count = 0;
        double remainingCapacity = totalCapacity;
        int suitcases = 0;

        while (!input.equals("End")) {
            double suitcaseVolume = Double.parseDouble(input);
            count++;

            if (count % 3 == 0) {
                if (suitcaseVolume > remainingCapacity) {
                    System.out.println("No more space!");
                    break;
                } else {
                    remainingCapacity -= suitcaseVolume * 1.10;
                }
            } else {
                if (suitcaseVolume > remainingCapacity) {
                    System.out.println("No more space!");
                    break;
                } else {
                    remainingCapacity -= suitcaseVolume;
                }
            }

            suitcases++;
            input = scanner.nextLine();
        }

        if (input.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }

        System.out.printf("Statistic: %d suitcases loaded.", suitcases);

    }
}

//90/100 (⚠️ има някаква грешка при изпълнение на 1 от тестовете, но не пише каква)