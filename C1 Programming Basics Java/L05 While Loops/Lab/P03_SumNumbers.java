package L05_WhileLoops.Lab;

import java.util.Scanner;

public class P03_SumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialNumber = Integer.parseInt(scanner.nextLine());
        int sumOther = 0;

        while (sumOther < initialNumber) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sumOther += currentNumber;

        }

        System.out.println(sumOther);
    }
}

//100/100