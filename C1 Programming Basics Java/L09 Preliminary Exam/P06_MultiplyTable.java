package L09_PreliminaryExam;

import java.util.Scanner;

public class P06_MultiplyTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String numberText = "" + number;

        for (int d1 = 1; d1 <= Integer.parseInt("" + numberText.charAt(2)); d1++) {
            for (int d2 = 1; d2 <= Integer.parseInt("" + numberText.charAt(1)); d2++) {
                for (int d3 = 1; d3 <= Integer.parseInt("" + numberText.charAt(0)); d3++) {
                    int result = d1 * d2 * d3;
                    System.out.printf("%d * %d * %d = %d;\n", d1, d2, d3, result);
                }
            }
        }
    }
}

//100/100