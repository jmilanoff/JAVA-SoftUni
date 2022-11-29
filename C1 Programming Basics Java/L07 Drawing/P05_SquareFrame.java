package L07_Drawing;

import java.util.Scanner;

public class P05_SquareFrame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                System.out.print("+ ");
                for (int j = 1; j <= n - 2; j++) {
                    System.out.print("- ");
                }
                System.out.println("+");
            } else {
                System.out.print("| ");
                for (int j = 1; j <= n - 2; j++) {
                    System.out.print("- ");
                }
                System.out.println("|");
            }
        }
    }
}

//100/100