package L08_OldExams.E6_July2019;

import java.util.Scanner;

public class P04_Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int walls = 4;
        int emptyAreaPercent = Integer.parseInt(scanner.nextLine());

        int totalArea = height * width * walls;
        double paintingArea = totalArea * ((100 - emptyAreaPercent) / 100.0);

        for (int i = 1; i > 0; i++) {
            String input = scanner.nextLine();

            if (input.equals("Tired!")) {
                System.out.printf("%.0f quadratic m left.", paintingArea);
                break;
            }

            int litres = Integer.parseInt(input);
                paintingArea -= litres;
                    if (paintingArea == 0) {
                        System.out.println("All walls are painted! Great job, Pesho!");
                        break;
                    } else if (paintingArea < 0) {
                        System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(paintingArea));
                        break;
                    }

        }

    }
}

//100/100