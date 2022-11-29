package L05_WhileLoops.Lab;

import java.util.Scanner;

public class P01_ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (!text.equals("Stop")) {
            System.out.println(text);

            text = scanner.nextLine();

        }
    }
}

//100/100