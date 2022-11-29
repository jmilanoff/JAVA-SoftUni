package L07_Drawing;

import java.util.Scanner;

public class P07_ChristmasTree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String interval = " ";
        String star = "*";
        String line = " |";

        for (int i = 0; i <= n; i++) {
            System.out.print(interval.repeat(n-i));
            System.out.print(star.repeat(i));
            System.out.print(line);
            System.out.print(interval);
            System.out.println(star.repeat(i));

            }
        }
    }

//100/100 (⚠️ пак нямам съвсем представа как го реших + ползвах подсказките)