package L06_NestedLoops.Lab;

import java.util.Scanner;

public class P04_SumOf2Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean isFound = false;
        int num1 = 0;
        int num2 = 0;

        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end ; j++) {
                count++;
                    if (i + j == magicNumber) {
                        num1 = i;
                        num2 = j;
                        isFound = true;
                        break;
                    }
                }
            if (isFound) {
                break;
            }
        }

        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", count, num1, num2, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}

//100/100