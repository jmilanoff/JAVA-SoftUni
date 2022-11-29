package L07_Drawing;

import java.util.Scanner;

public class P04_TriangleOfDollars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int r = 1; r <= n; r++) {
            for (int i = 1; i <= r; i++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}

//100/100