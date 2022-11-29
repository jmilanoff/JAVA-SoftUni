package L01_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P09_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double sumWithoutDiscount = area * 7.61;
        double discount = sumWithoutDiscount * 0.18;
        double result = sumWithoutDiscount - discount;

        System.out.printf("The final price is %f lv.", result);
        System.out.printf("The discount is %f lv.", discount);
    }
}
