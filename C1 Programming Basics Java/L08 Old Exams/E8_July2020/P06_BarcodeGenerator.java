package L08_OldExams.E8_July2020;

import java.util.Scanner;

public class P06_BarcodeGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        String startText = "" + start;
        String endText = "" + end;

        int d1Start = startText.charAt(0);
        int d2Start = startText.charAt(1);
        int d3Start = startText.charAt(2);
        int d4Start = startText.charAt(3);

        int d1End = endText.charAt(0);
        int d2End = endText.charAt(1);
        int d3End = endText.charAt(2);
        int d4End = endText.charAt(3);

        for (int d1 = d1Start; d1 <= d1End; d1++) {
            for (int d2 = d2Start; d2 <= d2End; d2++) {
                for (int d3 = d3Start; d3 <= d3End; d3++) {
                    for (int d4 = d4Start; d4 <= d4End; d4++) {
                        if (d1 % 2 != 0 && d2 % 2 != 0 && d3 % 2 != 0 && d4 % 2 != 0) {
                            System.out.printf("%c%c%c%c ", d1, d2, d3, d4);
                        }
                    }
                }
            }
        }
    }
}

//100/100 (⚠️ принтирай символите, не числата от ASCII таблицата)