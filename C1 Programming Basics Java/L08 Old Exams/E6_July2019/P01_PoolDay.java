package L08_OldExams.E6_July2019;

import java.util.Scanner;

public class P01_PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double fee = Double.parseDouble(scanner.nextLine());
        double chairPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double umbrellasBudget = Math.ceil(people / 2.0) * umbrellaPrice;
        double chairBudget = Math.ceil(people * 0.75) * chairPrice;
        double feeBudget = fee * people;

        System.out.printf("%.2f lv.", umbrellasBudget + chairBudget + feeBudget);
    }
}

//100/100