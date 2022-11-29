package L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P09_SumOf2Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;
        int count = 0;

        for (int n1 = start; n1 <= end; n1++) {
            for (int n2 = start; n2 <= end; n2++) {
                count++;
                if (n1 + n2 == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, n1, n2, magicNum);
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}

//100/100