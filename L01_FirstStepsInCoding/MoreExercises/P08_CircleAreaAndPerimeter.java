package L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P08_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        String areaFinal = String.format("%.2f", area);
        String perimeterFinal = String.format("%.2f", perimeter);

        System.out.println(areaFinal);
        System.out.println(perimeterFinal);
    }
}
