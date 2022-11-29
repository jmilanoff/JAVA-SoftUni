package L10_RegularExam;

import java.util.Scanner;

public class P01_MiningRig {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pricePerCard = Integer.parseInt(scanner.nextLine());
        int pricePerSwitch = Integer.parseInt(scanner.nextLine());
        double electricityPerCardPerDay = Double.parseDouble(scanner.nextLine());
        double profitPerCardPerDay = Double.parseDouble(scanner.nextLine());

        double investment = 1000 + 13 * pricePerCard + 13 * pricePerSwitch;
        double timeTillBreakeven = Math.ceil(investment / (13 * (profitPerCardPerDay - electricityPerCardPerDay)));

        System.out.printf("%.0f\n", investment);
        System.out.printf("%.0f", timeTillBreakeven);;

    }
}

//100/100