package L01_FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class P06_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double skumriaPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        int kgMidi = Integer.parseInt(scanner.nextLine());

        double palamudPrice = skumriaPrice * 1.6;
        double safridprice = cacaPrice * 1.8;
        double midiPrice = 7.5;

        double total = kgPalamud * palamudPrice + kgSafrid * safridprice + kgMidi * midiPrice;
        String result = String.format("%.2f", total);

        System.out.println(result);
    }
}
