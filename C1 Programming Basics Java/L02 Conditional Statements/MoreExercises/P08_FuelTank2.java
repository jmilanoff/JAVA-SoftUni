package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P08_FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        // gasoline / diesel / gas
        // 20-25 / >25
        // card / no card


        switch (type) {
            case "Gasoline":
                if (amount >= 20 && amount <= 25) {
                    if (card.equals("Yes")) {
                        System.out.printf("%.2f lv.", amount * (2.22 - 0.18) * 0.92); break;
                    } else {
                        System.out.printf("%.2f lv.", amount * 2.22 * 0.92); break;
                    }
                } else if (amount > 25) {
                    if (card.equals("Yes")) {
                        System.out.printf("%.2f lv.", amount * (2.22 - 0.18) * 0.90); break;
                    } else {
                        System.out.printf("%.2f lv.", amount * 2.22 * 0.90); break;
                    }
                } else if (amount < 20) {
                    if (card.equals("Yes")) {
                        System.out.printf("%.2f lv.", amount * (2.22 - 0.18)); break;
                    } else {
                        System.out.printf("%.2f lv.", amount * 2.22);
                        break;
                    }
                }

            case "Diesel":
                if (amount >= 20 && amount <= 25) {
                    if (card.equals("Yes")) {
                        System.out.printf("%.2f lv.", amount * (2.33 - 0.12) * 0.92); break;
                    } else {
                        System.out.printf("%.2f lv.", amount * 2.33 * 0.92); break;
                    }
                } else if (amount > 25)
                    if (card.equals("Yes")) {
                        System.out.printf("%.2f lv.", amount * (2.33 - 0.12) * 0.90); break;
                    } else {
                        System.out.printf("%.2f lv.", amount * 2.33 * 0.90); break;
                } else if (amount < 20) {
                    if (card.equals("Yes")) {
                        System.out.printf("%.2f lv.", amount * (2.33 - 0.12)); break;
                    } else {
                        System.out.printf("%.2f lv.", amount * 2.33); break;
                    }
                }

            case "Gas":
                if (amount >= 20 && amount <= 25) {
                    if (card.equals("Yes")) {
                        System.out.printf("%.2f lv.", amount * (0.93 - 0.08) * 0.92); break;
                    } else {
                        System.out.printf("%.2f lv.", amount * 0.93 * 0.92); break;
                    }
                } else if (amount > 25)
                    if (card.equals("Yes")) {
                        System.out.printf("%.2f lv.", amount * (0.93 - 0.08) * 0.90); break;
                    } else {
                        System.out.printf("%.2f lv.", amount * 0.93 * 0.90); break;
                } else if (amount < 20) {
                    if (card.equals("Yes")) {
                        System.out.printf("%.2f lv.", amount * (0.93 - 0.08)); break;
                    } else {
                        System.out.printf("%.2f lv.", amount * 0.93); break;
                    }
                }
        }

    }


}
