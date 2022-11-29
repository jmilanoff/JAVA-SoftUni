package L05_WhileLoops.Exercises;

import java.util.Scanner;

public class P05_Coins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        double change = Math.round(input * 100);
        int coins = 0;

        while (change > 0) {
            if (change >= 200) {
                coins++;
                change -= 200;
            } else if (change >= 100 && change < 200) {
                coins++;
                change -= 100;
            } else if (change >= 50 && change < 100) {
                coins++;
                change -= 50;
            } else if (change >= 20 && change < 50) {
                coins++;
                change -= 20;
            } else if (change >= 10 && change < 20) {
                coins++;
                change -= 10;
            } else if (change >= 5 && change < 10) {
                coins++;
                change -= 5;
            } else if (change >= 2 && change < 5) {
                coins++;
                change -= 2;
            } else if (change >= 1 && change < 2) {
                coins++;
                change -= 1;
            }
        }
        System.out.println(coins);
    }
}

//100/100 (даже открих грешка на Юлиян Кастаманов – Math.floor понякога закръгля грешно)