package L02_ConditionalStatements.Lab;

import java.util.Scanner;

public class P07_FiguresArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        if (type.equals("square")) {
        double squareSide = Double.parseDouble(scanner.nextLine());
        double squareArea = squareSide * squareSide;
            System.out.printf("%.3f", squareArea);
        } else if (type.equals("rectangle")) {
          double rectSide1 = Double.parseDouble(scanner.nextLine());
          double rectSide2 = Double.parseDouble(scanner.nextLine());
          double rectArea = rectSide1 * rectSide2;
            System.out.printf("%.3f", rectArea);
        } else if (type.equals("circle")) {
          double radius = Double.parseDouble(scanner.nextLine());
          double circleArea = Math.PI * Math.pow(radius, 2);
            System.out.printf("%.3f", circleArea);
        } else if (type.equals("triangle")) {
          double trSide = Double.parseDouble(scanner.nextLine());
          double trHeight = Double.parseDouble(scanner.nextLine());
          double trArea = trHeight * trSide / 2;
            System.out.printf("%.3f", trArea);
        }
    }
}
