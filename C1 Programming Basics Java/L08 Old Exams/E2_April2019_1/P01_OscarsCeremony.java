package L08_OldExams.E2_April2019_1;

import java.util.Scanner;

public class P01_OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double prizes = rent * 0.7;
        double catering = prizes * 0.85;
        double sound = catering / 2;

        double totalBudget = prizes + catering + sound + rent;

        System.out.printf("%.2f", totalBudget);
    }
}

//100/100