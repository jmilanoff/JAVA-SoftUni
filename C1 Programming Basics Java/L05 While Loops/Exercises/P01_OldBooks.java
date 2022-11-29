package L05_WhileLoops.Exercises;

import java.util.Scanner;

public class P01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favorite = scanner.nextLine();
        String current = scanner.nextLine();

        int count = 0;

        while (!current.equals("No More Books")) {

            if (current.equals(favorite)) {
                System.out.printf("You checked %d books and found it.", count);
                break;
            }

            count++;
            current = scanner.nextLine();

        }

        if (current.equals("No More Books")) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", count);
        }

    }
}

// 100/100 (⚠️ не бях съобразил, че втория ред от конзолата също се чете, преди while loop-а)