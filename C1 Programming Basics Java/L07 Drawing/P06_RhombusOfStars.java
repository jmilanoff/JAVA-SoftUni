package L07_Drawing;

import java.util.Scanner;

public class P06_RhombusOfStars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String star = "*";
        String interval = " ";
        String intStar = " *";

        for (int row = 1; row <= n; row++) {
            System.out.print(interval.repeat(n - row)); //⚠️ нова функция!!!
            System.out.print(star);
            System.out.println(intStar.repeat(row - 1));
        }

        for (int row = n - 1; row >= 1; row--) {
            System.out.print(interval.repeat(n - row));
            System.out.print(star);
            System.out.println(intStar.repeat(row - 1));
        }
    }
}

//100/100 (⚠️ не ми е много ясно как я реших + ползвах подсказките)