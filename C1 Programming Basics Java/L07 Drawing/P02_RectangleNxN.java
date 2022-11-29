package L07_Drawing;

import java.util.Scanner;

public class P02_RectangleNxN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int s1 = 1; s1 <= n; s1++) {
            for (int s2 = 1; s2 <= n; s2++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

//100/100