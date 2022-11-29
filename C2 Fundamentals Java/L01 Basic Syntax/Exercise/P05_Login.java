package L1_BasicSyntax.Exercise;

import java.util.Scanner;

public class P05_Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String correctPass = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            correctPass += username.charAt(i);
        }

        String attemptedPass = scanner.nextLine();
        int countFails = 0;

        while (!attemptedPass.equals(correctPass)) {
            countFails++;
            if (countFails > 3) {
                    System.out.printf("User %s blocked!", username);
                    break;
                } else {
                    System.out.println("Incorrect password. Try again.");
                }
                attemptedPass = scanner.nextLine();
        }

        if (attemptedPass.equals(correctPass)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}

//100/100