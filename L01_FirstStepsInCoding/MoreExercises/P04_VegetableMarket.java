package L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P04_VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double veggiesPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int veggiesKg = Integer.parseInt(scanner.nextLine());
        int fruitsKg = Integer.parseInt(scanner.nextLine());

        double finalPrice = (veggiesPrice * veggiesKg + fruitsPrice * fruitsKg) / 1.94;
        String result = String.format("%.2f",finalPrice);

        System.out.println(result);
    }
}
