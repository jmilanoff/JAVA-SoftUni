package L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P02_LetterCombinations_ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.next().charAt(0); //a
        char end = scanner.next().charAt(0); //c
        char exception = scanner.next().charAt(0); //b

        int count = 0;

        for (int first = start; first <= end; first++) {
            if (first == exception) {
                continue;
            }
            for (int second = start; second <= end; second++) {
                if (second == exception) {
                    continue;
                }
                for (int third = start; third <= end; third++) {
                    if (third != exception) {
                        count++;
                        System.out.printf("%c%c%c ", first, second, third);
                    }
                }
            }
        }
        System.out.print(count);
    }
}

//90/100 (⚠️ единият от тестовете го time-out-ва по някаква причина)