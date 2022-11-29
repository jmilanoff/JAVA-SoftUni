package L04_ForLoops.MoreExercises;

import java.util.Scanner;

public class P06_Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double totalExpenses = 0;

        double totalElectricity = 0;
        int totalWater = months * 20;
        int totalInternet = months * 15;
        double totalOther = 0;

        for (int i = 1; i <= months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
                totalExpenses += (electricity + 20 + 15) * 2.2;
                totalElectricity += electricity;
                totalOther += (electricity + 20 + 15) * 1.2;

        }
        System.out.printf("Electricity: %.2f lv\n", totalElectricity);
        System.out.printf("Water: %.2f lv\n", 1.0 * totalWater);
        System.out.printf("Internet: %.2f lv\n", 1.0 * totalInternet);
        System.out.printf("Other: %.2f lv\n", totalOther);
        System.out.printf("Average: %.2f lv", totalExpenses / months);

    }
}

//100/100