package L09_PreliminaryExam;

import java.util.Scanner;

public class P05_ExcursionSale {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaTrips = Integer.parseInt(scanner.nextLine());
        int mountainTrips = Integer.parseInt(scanner.nextLine());

        int price = 0;
        int totalSales = 0;

        int countSeaTrips = 0;
        int countMountainTrips = 0;

        String purchase = scanner.nextLine();

        while (!purchase.equals("Stop")) {
            switch (purchase) {
                case "sea":
                    price = 680;
                        if (countSeaTrips == seaTrips) {
                            purchase = scanner.nextLine();
                            continue;
                        } else {
                            countSeaTrips++;
                            totalSales += price;
                        }
                    break;
                case "mountain":
                    price = 499;
                        if (countMountainTrips == mountainTrips) {
                            purchase = scanner.nextLine();
                            continue;
                        } else {
                            countMountainTrips++;
                            totalSales += price;
                        }
                    break;
            }

            if (countSeaTrips == seaTrips && countMountainTrips == mountainTrips) {
                break;
            }

            purchase = scanner.nextLine();
        }

        if (countSeaTrips == seaTrips && countMountainTrips == mountainTrips) {
            System.out.println("Good job! Everything is sold.");
        }

        System.out.printf("Profit: %d leva.", totalSales);

    }
}

//100/100