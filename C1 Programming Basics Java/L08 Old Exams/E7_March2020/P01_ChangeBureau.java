package L08_OldExams.E7_March2020;

import java.util.Scanner;

public class P01_ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double yuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        // 1 биткойн = 1168 лева.
        // 1 китайски юан = 0.15 долара.
        // 1 долар = 1.76 лева.
        // 1 евро = 1.95 лева.

        double bitcoinToEur = bitcoins * 1168 / 1.95;
        double yuanToEur = yuan * 0.15 * 1.76 / 1.95;

        double result = (bitcoinToEur + yuanToEur) * ((100 - commission) / 100);
        System.out.printf("%.2f", result);
    }
}

//100/100
