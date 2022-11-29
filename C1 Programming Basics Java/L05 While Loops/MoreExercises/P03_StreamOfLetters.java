package L05_WhileLoops.MoreExercises;

import java.util.Scanner;

public class P03_StreamOfLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int cCount = 0;
        int oCount = 0;
        int nCount = 0;

        String text = "";

        while (!input.equals("End")) {
            char ch = input.charAt(0);

            if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
                switch (ch) {
                    case 'c':
                        if (cCount < 1) {
                            cCount++;
                                if (cCount == 1 && oCount == 1 && nCount == 1) {
                                    System.out.print(text + " ");
                                    text = "";
                                    cCount = 0;
                                    oCount = 0;
                                    nCount = 0;
                                }
                        } else {
                            text += ch;
                        }
                        break;
                    case 'o':
                        if (oCount < 1) {
                            oCount++;
                                if (cCount == 1 && oCount == 1 && nCount == 1) {
                                    System.out.print(text + " ");
                                    text = "";
                                    cCount = 0;
                                    oCount = 0;
                                    nCount = 0;
                                }
                        } else {
                            text += ch;
                        }
                        break;
                    case 'n':
                        if (nCount < 1) {
                            nCount++;
                                if (cCount == 1 && oCount == 1 && nCount == 1) {
                                    System.out.print(text + " ");
                                    text = "";
                                    cCount = 0;
                                    oCount = 0;
                                    nCount = 0;
                                }
                        } else {
                            text += ch;
                        }
                        break;
                    default:
                        text += ch;
                        break;
                }

            } else {
                input = scanner.nextLine();
                continue;
            }

            input = scanner.nextLine();

        }

    }
}

//100/100 (⚠️ най-трудната ми задача досега)