package L08_OldExams.E5_June2019;

import java.util.Scanner;

public class P01_MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int movieCommission = Integer.parseInt(scanner.nextLine());

        double profit = (days * tickets * price) * ((100 - movieCommission) / 100.0);

        System.out.printf("The profit from the movie %s is %.2f lv.", movie, profit);
    }
}

//100/100

