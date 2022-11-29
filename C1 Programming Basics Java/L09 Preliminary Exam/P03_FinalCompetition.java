package L09_PreliminaryExam;

import java.util.Scanner;

public class P03_FinalCompetition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int members = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double wonMoney = 0;

        switch (place) {
            case "Bulgaria":
                wonMoney = members * points;
                    if (season.equals("summer")) {
                        wonMoney *= 0.95;
                    } else if (season.equals("winter")) {
                        wonMoney *= 0.92;
                    }
                break;
            case "Abroad":
                wonMoney = (members * points) * 1.50;
                    if (season.equals("summer")) {
                        wonMoney *= 0.90;
                    } else if (season.equals("winter")) {
                        wonMoney *= 0.85;
                    }
                break;
        }

        double charity = wonMoney * 0.75;
        double leftMoney = wonMoney - charity;

        System.out.printf("Charity - %.2f\n", charity);
        System.out.printf("Money per dancer - %.2f", leftMoney / members);

    }
}

//100/100