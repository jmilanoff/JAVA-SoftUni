package L02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P01_PoolPipes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double litresFilled = P1 * H + P2 * H;

        if (V > litresFilled) {
            double percentageFilled = litresFilled / V * 100;
            double P1Share = (P1 * H) / litresFilled * 100;
            double P2Share = (P2 * H) / litresFilled * 100;
            char perc = '%';
            //System.out.println("The pool is " + percentageFilled * 100 + "% full. Pipe 1: " + P1Share + "%. Pipe 2: " + P2Share + "%");
            System.out.printf("The pool is %.2f%c full. Pipe 1: %.2f%c. Pipe 2: %.2f%c.", percentageFilled, perc, P1Share, perc, P2Share, perc);
        } else {
            double overflow = litresFilled - V;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, overflow);
        }
    }
}

//92/100 в Judge