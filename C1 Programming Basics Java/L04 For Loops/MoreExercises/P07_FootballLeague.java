package L04_ForLoops.MoreExercises;

import java.util.Scanner;

public class P07_FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());

        int aFans = 0;
        int bFans = 0;
        int vFans = 0;
        int gFans = 0;

        for (int i = 1; i <= fans; i++) {
            String sector = scanner.nextLine();
                switch (sector) {
                    case "A":
                        aFans++;
                        break;
                    case "B":
                        bFans++;
                        break;
                    case "V":
                        vFans++;
                        break;
                    case "G":
                        gFans++;
                        break;
                }

        }
        System.out.printf("%.2f%%\n", 1.0 * aFans / fans * 100);
        System.out.printf("%.2f%%\n", 1.0 * bFans / fans * 100);
        System.out.printf("%.2f%%\n", 1.0 * vFans / fans * 100);
        System.out.printf("%.2f%%\n", 1.0 * gFans / fans * 100);

        int totalFans = aFans + bFans + vFans + gFans;
        System.out.printf("%.2f%%", 1.0 * totalFans / capacity * 100);
    }
}

//100/100