package L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int liquid = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

       double pensPrice = pens * 5.80;
       double markersPrice = markers * 7.20;
       double liquidPrice = liquid * 1.20;

       double total = pensPrice + markersPrice + liquidPrice;
       double finalsum = total - (total * discount/100);

       System.out.println(finalsum);
    }
}
