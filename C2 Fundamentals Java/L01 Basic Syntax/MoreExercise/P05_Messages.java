package L1_BasicSyntax.MoreExercise;

import java.util.Scanner;

public class P05_Messages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 10) {
                switch (num) {
                    case 2:
                        System.out.print("a");
                        break;
                    case 3:
                        System.out.print("d");
                        break;
                    case 4:
                        System.out.print("g");
                        break;
                    case 5:
                        System.out.print("j");
                        break;
                    case 6:
                        System.out.print("m");
                        break;
                    case 7:
                        System.out.print("p");
                        break;
                    case 8:
                        System.out.print("t");
                        break;
                    case 9:
                        System.out.print("w");
                        break;
                    case 0:
                        System.out.print(" ");
                        break;
                }

            } else if (num < 100) {
                switch (num) {
                    case 22:
                        System.out.print("b");
                        break;
                    case 33:
                        System.out.print("e");
                        break;
                    case 44:
                        System.out.print("h");
                        break;
                    case 55:
                        System.out.print("k");
                        break;
                    case 66:
                        System.out.print("n");
                        break;
                    case 77:
                        System.out.print("q");
                        break;
                    case 88:
                        System.out.print("u");
                        break;
                    case 99:
                        System.out.print("x");
                        break;
                }

            } else if (num < 1000) {
                switch (num) {
                    case 222:
                        System.out.print("c");
                        break;
                    case 333:
                        System.out.print("f");
                        break;
                    case 444:
                        System.out.print("i");
                        break;
                    case 555:
                        System.out.print("l");
                        break;
                    case 666:
                        System.out.print("o");
                        break;
                    case 777:
                        System.out.print("r");
                        break;
                    case 888:
                        System.out.print("v");
                        break;
                    case 999:
                        System.out.print("y");
                        break;
                }
            } else if (num < 10000) {
                switch (num) {
                    case 7777:
                        System.out.print("s");
                        break;
                    case 9999:
                        System.out.print("z");
                        break;
                }
            }
        }
    }
}

//100/100