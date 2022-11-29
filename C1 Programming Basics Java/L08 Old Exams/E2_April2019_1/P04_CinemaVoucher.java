package L08_OldExams.E2_April2019_1;

import java.util.Scanner;

public class P04_CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());
        int turns = 1000000;
        int remainder = voucher;

        int movies = 0;
        int otherProducts = 0;

        for (int i = 1; i <= turns; i++) {
            String purchase = scanner.nextLine();
            int price = 0;

            if (purchase.equals("End")) {
                break;
            }

            if (purchase.length() > 8) {
                    int ch1 = purchase.charAt(0);
                    int ch2 = purchase.charAt(1);
                    price = ch1 + ch2;
                        if (price <= remainder) {
                            movies++;
                            remainder -= price;
                        } else {
                            break;
                        }

            } else {
                    int ch1 = purchase.charAt(0);
                    price = ch1;
                        if (price <= remainder) {
                            otherProducts++;
                            remainder -= price;
                        } else {
                            break;
                        }
            }

        }

        System.out.println(movies);
        System.out.println(otherProducts);
    }
}

//100/100