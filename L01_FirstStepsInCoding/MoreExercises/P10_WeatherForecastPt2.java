package L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P10_WeatherForecastPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weather = Double.parseDouble(scanner.nextLine());

        if (weather <= 4.9) {
            System.out.println("unknown");
        } else if (weather <= 11.9) {
            System.out.println("Cold");
        } else if (weather <= 14.9) {
            System.out.println("Cool");
        } else if (weather <= 20.0) {
            System.out.println("Mild");
        } else if (weather <= 25.9) {
            System.out.println("Warm");
        } else if (weather <= 35.0) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }
    }
}
