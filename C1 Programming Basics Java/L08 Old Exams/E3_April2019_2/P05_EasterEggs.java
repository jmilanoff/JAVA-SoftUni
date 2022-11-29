package L08_OldExams.E3_April2019_2;

import java.util.Scanner;

public class P05_EasterEggs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;

        int max = 0;
        String maxColor = "";

        int totalEggs = Integer.parseInt(scanner.nextLine());
        int count = 0;

        while (count < totalEggs) {
            count++;
            String color = scanner.nextLine();
                switch (color) {
                    case "red":
                        red++;
                            if (red > max) {
                                max = red;
                                maxColor = "red";
                            }
                        break;
                    case "orange":
                        orange++;
                        if (orange > max) {
                            max = orange;
                            maxColor = "orange";
                        }
                        break;
                    case "blue":
                        blue++;
                        if (blue > max) {
                            max = blue;
                            maxColor = "blue";
                        }
                        break;
                    case "green":
                        green++;
                        if (green > max) {
                            max = green;
                            maxColor = "green";
                        }
                        break;

                }
            if (count == totalEggs) {
                break;
            }

        }

        System.out.printf("Red eggs: %d\n", red);
        System.out.printf("Orange eggs: %d\n", orange);
        System.out.printf("Blue eggs: %d\n", blue);
        System.out.printf("Green eggs: %d\n", green);
        System.out.printf("Max eggs: %d -> %s\n", max, maxColor);

    }
}

//100/100