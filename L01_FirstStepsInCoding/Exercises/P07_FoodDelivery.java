package L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int veggie = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chicken * 10.35;
        double fishPrice = fish * 12.40;
        double veggiePrice = veggie * 8.15;
        double desertPrice = (chickenPrice + fishPrice + veggiePrice) * 0.20;

        double finalSum = chickenPrice + fishPrice + veggiePrice + desertPrice + 2.50;

        System.out.println(finalSum);
    }
}
