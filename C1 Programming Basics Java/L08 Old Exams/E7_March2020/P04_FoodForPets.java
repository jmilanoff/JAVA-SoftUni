package L08_OldExams.E7_March2020;

import java.util.Scanner;

public class P04_FoodForPets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double initialFood = Double.parseDouble(scanner.nextLine());

        double biscuitsEaten = 0;
        double eatenByDog = 0;
        double eatenByCat = 0;


        for (int i = 1; i <= days; i++) {
            double dogFood = Integer.parseInt(scanner.nextLine());
            double catFood = Integer.parseInt(scanner.nextLine());

            eatenByDog += dogFood;
            eatenByCat += catFood;

            if (i % 3 == 0) {
                biscuitsEaten += (dogFood + catFood) * 0.1;
            }

        }

        double totalEaten = eatenByDog + eatenByCat;

        System.out.printf("Total eaten biscuits: %.0fgr.\n", (biscuitsEaten));
        System.out.printf("%.2f%% of the food has been eaten.\n", totalEaten / initialFood * 100);
        System.out.printf("%.2f%% eaten from the dog.\n", eatenByDog / totalEaten * 100);
        System.out.printf("%.2f%% eaten from the cat.", eatenByCat / totalEaten * 100);

    }
}

//100/100 (⚠️ по някаква причина смяташе * 10/100 за различно от * 0.1)