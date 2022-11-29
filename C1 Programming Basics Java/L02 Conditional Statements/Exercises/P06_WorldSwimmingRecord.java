package L02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePer1m = Double.parseDouble(scanner.nextLine());

        double resultNoResistance = distance * timePer1m;
        double resultWithResistance = resultNoResistance + (Math.floor(distance / 15) * 12.5);

        if (resultWithResistance < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", resultWithResistance);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", resultWithResistance - record);
        }

    }
}
