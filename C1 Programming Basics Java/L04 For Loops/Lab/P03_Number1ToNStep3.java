package L04_ForLoops.Lab;

import java.util.Scanner;

public class P03_Number1ToNStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }
    }
}

//100/100