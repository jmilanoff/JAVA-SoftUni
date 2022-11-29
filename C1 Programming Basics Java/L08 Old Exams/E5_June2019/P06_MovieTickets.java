package L08_OldExams.E5_June2019;

import java.util.Scanner;

public class P06_MovieTickets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int s1 = a1; s1 <= a2 - 1; s1++) {
            for (int s2 = 1; s2 <= n - 1; s2++) {
                for (int s3 = 1; s3 <= n / 2 - 1; s3++) {
                    if (s1 % 2 != 0 && (s2 + s3 + s1) % 2 != 0) {
                        System.out.printf("%c-%d%d%d\n", s1, s2, s3, s1);
                    }
                }
            }
        }
    }
}

//100/100 (⚠️ когато искаш ASCII буквата, ползваш %c. За цифровата стойност ползваш %d)