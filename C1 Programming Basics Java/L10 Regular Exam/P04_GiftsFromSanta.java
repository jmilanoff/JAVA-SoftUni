package L10_RegularExam;

import java.util.Scanner;

public class P04_GiftsFromSanta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int S = Integer.parseInt(scanner.nextLine());

        for (int i = M; i >= N; i--) {
            if (i % 2 == 0 && i % 3 == 0) {
                if (i == S) {
                    break;
                } else {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}

//100/100