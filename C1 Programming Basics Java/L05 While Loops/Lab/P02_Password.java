package L05_WhileLoops.Lab;

import java.util.Scanner;

public class P02_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String passAttempt = scanner.nextLine();

        while (!passAttempt.equals(password)) {
            passAttempt = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", username);

    }
}

//100/100