package L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int membership = Integer.parseInt(scanner.nextLine());

        double sneakers = membership * 0.60;
        double outfit = sneakers * 0.80;
        double ball = outfit * 0.25;
        double accessories = ball * 0.20;

        double sum = membership + sneakers + outfit + ball + accessories;

        System.out.println(sum);
    }
}
