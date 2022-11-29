package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P03_NewHouse {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String type = scanner.nextLine();
       int number = Integer.parseInt(scanner.nextLine());
       int budget = Integer.parseInt(scanner.nextLine());

       double price = 0;

       switch (type) {
           case "Roses":
               price = 5;
               if (number > 80) {
                   price = price * 0.9;
               }
               break;
           case "Dahlias":
               price = 3.80;
               if (number > 90) {
                   price = price * 0.85;
               }
               break;
           case "Tulips":
               price = 2.80;
               if (number > 80) {
                   price = price * 0.85;
               }
               break;
           case "Narcissus":
               price = 3;
               if (number < 120) {
                   price = price * 1.15;
               }
               break;
           case "Gladiolus":
               price = 2.50;
               if (number < 80) {
                   price = price * 1.2;
               }
               break;
       }
        double sum = number * price;
        if (budget >= sum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, type, budget - sum );
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", sum - budget);
        }

    }
}