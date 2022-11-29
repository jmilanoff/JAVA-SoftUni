package L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P13_PrimePairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startN1 = Integer.parseInt(scanner.nextLine());
        int startN2 = Integer.parseInt(scanner.nextLine());
        int diffN1 = Integer.parseInt(scanner.nextLine());
        int diffN2 = Integer.parseInt(scanner.nextLine());
        int endN1 = startN1 + diffN1;
        int endN2 = startN2 + diffN2;

        int countN1Divisions = 0;
        int countN2Divisions = 0;

        int currentN1 = 0;
        int currentN2 = 0;

        for (int N1 = startN1; N1 <= endN1; N1++) {
            currentN1 = N1;
            for (int divN1 = 2; divN1 < N1; divN1++) {
                if (N1 % divN1 == 0) {
                    countN1Divisions++;
                }
                if (countN1Divisions > 0) {
                    countN1Divisions = 0;
                    break;

                }

                if (divN1 == N1 - 1) { //⚠️ ето тук беше ключът - да не пускаш натам, преди да си извъртял divN1 loop-а
                    for (int N2 = startN2; N2 <= endN2; N2++) {
                        currentN2 = N2;
                        for (int divN2 = 2; divN2 < N2; divN2++) {
                            if (N2 % divN2 == 0) {
                                countN2Divisions++;
                            }
                            if (countN2Divisions > 0) {
                                countN2Divisions = 0;
                                break;
                            }
                            if (divN2 == N2 - 1) { // ⚠️ и тук - не принтираш, преди да си извъртял и divN2 loop-а
                                System.out.printf("%d%d%n", currentN1, currentN2);
                            }
                        }
                    }
                }
            }
        }
    }
}

//100/100 (⚠️ най-трудната задача досега, реши отново БАВНО! --> редът на loop-овете беше много труден)