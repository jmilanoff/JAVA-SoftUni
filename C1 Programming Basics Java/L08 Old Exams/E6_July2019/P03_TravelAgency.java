package L08_OldExams.E6_July2019;

import java.util.Scanner;

public class P03_TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String pack = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        if (days > 7) {
            days = days - 1;
        }

        if (days < 1) {
            System.out.println("Days must be positive number!");
        } else {

            double price = 0;

            switch (city) {
                case "Bansko":
                case "Borovets":
                    switch (pack) {
                        case "noEquipment":
                            price = 80;
                            if (vip.equals("yes")) {
                                price = price * 0.95;
                            }
                            System.out.printf("The price is %.2flv! Have a nice time!", price * days);
                            break;
                        case "withEquipment":
                            price = 100;
                            if (vip.equals("yes")) {
                                price = price * 0.90;
                            }
                            System.out.printf("The price is %.2flv! Have a nice time!", price * days);
                            break;
                        default:
                            System.out.println("Invalid input!");
                            break;
                            }
                    break;
                case "Varna":
                case "Burgas":
                    switch (pack) {
                        case "noBreakfast":
                            price = 100;
                            if (vip.equals("yes")) {
                                price = price * 0.93;
                            }
                            System.out.printf("The price is %.2flv! Have a nice time!", price * days);
                            break;
                        case "withBreakfast":
                            price = 130;
                            if (vip.equals("yes")) {
                                price = price * 0.88;
                            }
                            System.out.printf("The price is %.2flv! Have a nice time!", price * days);
                            break;
                        default:
                            System.out.println("Invalid input!");
                            break;
                            }
                    break;
                    default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
    }
}

//100/100