package L1_BasicSyntax.MoreExercise;

import java.util.Scanner;

public class P04_ReverseStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String reverseText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText += text.charAt(i);
        }

        System.out.println(reverseText);
    }
}

//100/100