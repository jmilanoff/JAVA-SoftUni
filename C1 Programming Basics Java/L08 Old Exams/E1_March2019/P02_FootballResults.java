package L08_OldExams.E1_March2019;

import java.util.Scanner;

public class P02_FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result1 = scanner.nextLine();
        String result2 = scanner.nextLine();
        String result3 = scanner.nextLine();

        int wins = 0;
        int losses = 0;
        int draws = 0;

        if (result1.charAt(0) > result1.charAt(2)) {
            wins = wins + 1;
        } else if (result1.charAt(0) == result1.charAt(2)) {
            draws = draws + 1;
        } else if (result1.charAt(0) < result1.charAt(2)) {
            losses = losses + 1;
        }

        if (result2.charAt(0) > result2.charAt(2)) {
            wins = wins + 1;
        } else if (result2.charAt(0) == result2.charAt(2)) {
            draws = draws + 1;
        } else if (result2.charAt(0) < result2.charAt(2)) {
            losses = losses + 1;
        }

        if (result3.charAt(0) > result3.charAt(2)) {
            wins = wins + 1;
        } else if (result3.charAt(0) == result3.charAt(2)) {
            draws = draws + 1;
        } else if (result3.charAt(0) < result3.charAt(2)) {
            losses = losses + 1;
        }

        System.out.printf("Team won %d games.%n", wins);
        System.out.printf("Team lost %d games.%n", losses);
        System.out.printf("Drawn games: %d", draws);

    }
}

//100/100, но с НОВА СЛОЖНА КОНСТРУКЦИЯ -> result3.charAt(0) вади буква от стринг, НО започваш да броиш от 0 ⚠️