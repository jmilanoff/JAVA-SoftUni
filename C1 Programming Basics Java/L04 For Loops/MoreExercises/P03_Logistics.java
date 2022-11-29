package L04_ForLoops.MoreExercises;

import java.util.Scanner;

public class P03_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loads = Integer.parseInt(scanner.nextLine());

        int bill = 0;

        int busTonnage = 0;
        int truckTonnage = 0;
        int trainTonnage = 0;

        for (int i = 1; i <= loads; i++) {
            int tonnage = Integer.parseInt(scanner.nextLine());
                if (tonnage <= 3) {
                    bill += tonnage * 200;
                    busTonnage += tonnage;
                } else if (tonnage <= 11) {
                    bill += tonnage * 175;
                    truckTonnage += tonnage;
                } else {
                    bill += tonnage * 120;
                    trainTonnage += tonnage;
                }
        }
        int totalTonnage = busTonnage + truckTonnage + trainTonnage;

        System.out.printf("%.2f%n", 1.0 * bill / totalTonnage);
        System.out.printf("%.2f%%%n", 1.0 * busTonnage / totalTonnage * 100);
        System.out.printf("%.2f%%%n", 1.0 * truckTonnage / totalTonnage * 100);
        System.out.printf("%.2f%%", 1.0 * trainTonnage / totalTonnage * 100);
    }
}

//100/100 (беше 50/100, защото бях забравил = в >= на 12 тона)
