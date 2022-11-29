package L05_WhileLoops.Exercises;

import java.util.Scanner;

public class P06_Cake {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int pieces = width * length;

        while (pieces > 0) {
            String input = scanner.nextLine();

            if (input.equals("STOP")) {
                System.out.printf("%d pieces are left.", pieces);
                break;
            } else {
                int taken = Integer.parseInt(input);
                pieces -= taken;
                    if (pieces < 0) {
                        System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
                    }
            }
        }
    }
}

//100/100