package L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double usedArea = Double.parseDouble(scanner.nextLine()) /100;

        double litres = (length * width * height) / 1000.00;
        double result = litres - (litres * usedArea);

        System.out.println(result);
    }
}
