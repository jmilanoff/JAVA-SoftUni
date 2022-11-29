package L1_BasicSyntax.Exercise;

import java.util.Scanner;

public class P10_PadawanEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double pricePerLightsaber = Double.parseDouble(scanner.nextLine());
        double pricePerRobe = Double.parseDouble(scanner.nextLine());
        double pricePerBelt = Double.parseDouble(scanner.nextLine());

        int freeBelts = students / 6;

        double bill = pricePerLightsaber * (Math.ceil(students * 1.10)) +
                      pricePerRobe * students + pricePerBelt * (students - freeBelts);


        if (budget >= bill) {
            System.out.printf("The money is enough - it would cost %.2flv.", bill);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", bill - budget);
        }

    }
}

//100/100