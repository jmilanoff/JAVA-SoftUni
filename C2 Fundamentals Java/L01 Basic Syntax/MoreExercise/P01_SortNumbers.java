package L1_BasicSyntax.MoreExercise;

import java.util.Scanner;

public class P01_SortNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int middle = 0;
        int min = Integer.MAX_VALUE;

        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        if (num1 <= num2 && num1 <= num3) {
            min = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            min = num2;
        } else {
            min = num3;
        }

        if (max == num1 && min == num2 || max == num2 && min == num1) {
            middle = num3;
        } else if (max == num2 && min == num3 || max == num3 && min == num2) {
            middle = num1;
        } else {
            middle = num2;
        }

        System.out.println(max);
        System.out.println(middle);
        System.out.println(min);
    }
}

//100/100