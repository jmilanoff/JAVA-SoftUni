package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P07_FuelTank1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double fuelInTank = Double.parseDouble(scanner.nextLine());

        switch (fuelType) {
            case "Diesel":
                if (fuelInTank >= 25) {
                    System.out.printf("You have enough %s.", fuelType.toLowerCase()); break;
                } else {
                    System.out.printf("Fill your tank with %s!", fuelType.toLowerCase()); break;
                }
            case "Gasoline":
                if (fuelInTank >= 25) {
                    System.out.printf("You have enough %s.", fuelType.toLowerCase()); break;
                } else {
                    System.out.printf("Fill your tank with %s!", fuelType.toLowerCase()); break;
                }
            case "Gas":
                if (fuelInTank >= 25) {
                    System.out.printf("You have enough %s.", fuelType.toLowerCase()); break;
                } else {
                    System.out.printf("Fill your tank with %s!", fuelType.toLowerCase()); break;
                }
            default:
                    System.out.println("Invalid fuel!"); break;

            }
        }

    }

