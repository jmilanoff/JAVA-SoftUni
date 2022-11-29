package L04_ForLoops.MoreExercises;

import java.util.Scanner;

public class P01_BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritance = Double.parseDouble(scanner.nextLine());
        int endYear = Integer.parseInt(scanner.nextLine());

        int evenYearsSum = 0;
        int oddYearsSum = 0;
        int age = 18;

        for (int i = 1800; i <= endYear; i++) {
            if (i % 2 == 0 && i > 1800) {
                evenYearsSum += 12000;
                age++;
            } else if (i % 2 == 0 && i == 1800) {
                evenYearsSum += 12000;
            } else {
                age++;
                oddYearsSum += (12000 + 50 * age);
            }
        }

        int neededSum = evenYearsSum + oddYearsSum;
        if (neededSum <= inheritance) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritance - neededSum);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", neededSum - inheritance);
        }
    }
}

//100/100