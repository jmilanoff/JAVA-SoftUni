package L1_BasicSyntax.Lab;

import java.util.Scanner;

public class P04_BackIn30Minutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int leavingHours = Integer.parseInt(scanner.nextLine());
        int leavingMinutes = Integer.parseInt(scanner.nextLine());

        int timeAfter30Mins = leavingHours * 60 + leavingMinutes + 30;

        int comebackHours = timeAfter30Mins / 60;
        int comebackMinutes = timeAfter30Mins % 60;

        if (comebackHours > 23) {
            comebackHours = 0;
        }

        System.out.printf("%d:%02d", comebackHours, comebackMinutes);

    }
}