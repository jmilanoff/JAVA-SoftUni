package L08_OldExams.E1_March2019;

import java.util.Scanner;

public class P05_FitnessCenter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());
        int count = 0;

        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int prShake = 0;
        int prBar = 0;

        while (count < clients) {
            count++;
            String activity = scanner.nextLine();

            switch (activity) {
                case "Back":
                    back++;
                    break;
                case "Chest":
                    chest++;
                    break;
                case "Legs":
                    legs++;
                    break;
                case "Abs":
                    abs++;
                    break;
                case "Protein shake":
                    prShake++;
                    break;
                case "Protein bar":
                    prBar++;
                    break;

            }

            if (count == clients) {
                break;
            }

        }

        int workingOut = back + chest + legs + abs;
        int protein = prBar + prShake;

        System.out.printf("%d - back\n", back);
        System.out.printf("%d - chest\n", chest);
        System.out.printf("%d - legs\n", legs);
        System.out.printf("%d - abs\n", abs);
        System.out.printf("%d - protein shake\n", prShake);
        System.out.printf("%d - protein bar\n", prBar);
        System.out.printf("%.2f%% - work out\n", 1.0 * workingOut / clients * 100);
        System.out.printf("%.2f%% - protein", 1.0 * protein / clients * 100);

    }
}

//100/100