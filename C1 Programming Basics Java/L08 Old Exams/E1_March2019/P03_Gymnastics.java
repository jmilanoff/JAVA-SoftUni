package L08_OldExams.E1_March2019;

import java.util.Scanner;

public class P03_Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String tool = scanner.nextLine();

        double difficulty = 0;
        double execution = 0;

        switch (country) {
            case "Russia":
                if (tool.equals("ribbon")) {
                    difficulty = 9.100;
                    execution = 9.400;
                } else if (tool.equals("hoop")) {
                    difficulty = 9.300;
                    execution = 9.800;
                } else if (tool.equals("rope")) {
                    difficulty = 9.600;
                    execution = 9.000;
                }
                break;
            case "Bulgaria":
                if (tool.equals("ribbon")) {
                    difficulty = 9.600;
                    execution = 9.400;
                } else if (tool.equals("hoop")) {
                    difficulty = 9.550;
                    execution = 9.750;
                } else if (tool.equals("rope")) {
                    difficulty = 9.500;
                    execution = 9.400;
                }
                break;
            case "Italy":
                if (tool.equals("ribbon")) {
                    difficulty = 9.200;
                    execution = 9.500;
                } else if (tool.equals("hoop")) {
                    difficulty = 9.450;
                    execution = 9.350;
                } else if (tool.equals("rope")) {
                    difficulty = 9.700;
                    execution = 9.150;
                }
                break;
        }
        double score = difficulty + execution;
        double differenceInPercent = (20 - score) / 20 * 100;

        System.out.printf("The team of %s get %.3f on %s.%n", country, score, tool);
        System.out.printf("%.2f%%", differenceInPercent);
    }
}

//100/100