package L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P05_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());

        int rows = (int) (l * 100 / 120);
        int desksPerRow = (int) ((w * 100) - 100) / 70;

        int result = rows * desksPerRow - 3;

        System.out.println(result);
    }
}