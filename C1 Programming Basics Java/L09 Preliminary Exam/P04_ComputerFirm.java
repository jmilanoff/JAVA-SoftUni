package L09_PreliminaryExam;

import java.util.Scanner;

public class P04_ComputerFirm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalSales = 0;
        double totalRating = 0;

        for (int i = 1; i <= n; i++) {
            String number = scanner.nextLine();
            double currentSales = 0;

            String ratingText = "" + number.charAt(2);
            int rating = Integer.parseInt(ratingText);

            String potentialSalesText = "" + number.charAt(0) + number.charAt(1);
            int potentialSales = Integer.parseInt(potentialSalesText);

            switch (ratingText) {
                case "2":
                    currentSales = 0;
                    break;
                case "3":
                    currentSales = potentialSales * 0.5;
                    break;
                case "4":
                    currentSales = potentialSales * 0.7;
                    break;
                case "5":
                    currentSales = potentialSales * 0.85;
                    break;
                case "6":
                    currentSales = potentialSales;
                    break;
            }

            totalSales += currentSales;
            totalRating += rating;

        }

        System.out.printf("%.2f\n", totalSales);
        System.out.printf("%.2f", totalRating / n);

    }
}

//100/100