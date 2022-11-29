package L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paint + paint * 0.10) * 14.50;
        double thinnerPrice = thinner * 5.00;
        double bagsPrince = 0.40;

        double totalMaterials = nylonPrice + paintPrice + thinnerPrice + bagsPrince;

        double workPrice = totalMaterials * 0.30 * hours;

        double result = totalMaterials + workPrice;

        System.out.println(result);

    }
}
