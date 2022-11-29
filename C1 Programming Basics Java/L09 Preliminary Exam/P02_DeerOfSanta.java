package L09_PreliminaryExam;

import java.util.Scanner;

public class P02_DeerOfSanta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double deer1Food = Double.parseDouble(scanner.nextLine());
        double deer2Food = Double.parseDouble(scanner.nextLine());
        double deer3Food = Double.parseDouble(scanner.nextLine());

        double neededFood = days * (deer1Food + deer2Food + deer3Food);

        if (leftFood >= neededFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(leftFood - neededFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(neededFood - leftFood));
        }
    }
}

//100/100