package L08_OldExams.E6_July2019;

import java.util.Scanner;

public class P06_NewGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();
        int maxPoints = 0;
        String newLeader = "";

        while (!player.equals("Stop")) {
            int currentPoints = 0;

            for (int i = 1; i <= player.length(); i++) {
                int number = Integer.parseInt(scanner.nextLine());
                    if (number == player.charAt(i - 1)) {
                        currentPoints += 10;
                    } else {
                        currentPoints += 2;
                    }
                    if (currentPoints >= maxPoints) { //⚠️ супер ефективно с това =, сам се сетих
                        maxPoints = currentPoints;
                        newLeader = player;
                    }
            }

            player = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!", newLeader, maxPoints);
    }
}

//100/100 (макар че ако играчите са > 2 и всички имат равни точки, последният ще бие, вместо втория)