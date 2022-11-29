package L08_OldExams.E3_April2019_2;

import java.util.Scanner;

public class P03_PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int batches = Integer.parseInt(scanner.nextLine());

        int pricePerBatch = 0;

        switch (size) {
            case "Large":
                switch (color) {
                    case "Red":
                        pricePerBatch = 16;
                        break;
                    case "Green":
                        pricePerBatch = 12;
                        break;
                    case "Yellow":
                        pricePerBatch = 9;
                        break;
                }
                break;
            case "Medium":
                switch (color) {
                    case "Red":
                        pricePerBatch = 13;
                        break;
                    case "Green":
                        pricePerBatch = 9;
                        break;
                    case "Yellow":
                        pricePerBatch = 7;
                        break;
                }
                break;
            case "Small":
                switch (color) {
                    case "Red":
                        pricePerBatch = 9;
                        break;
                    case "Green":
                        pricePerBatch = 8;
                        break;
                    case "Yellow":
                        pricePerBatch = 5;
                        break;
                }
                break;

        }

        double bill = (batches * pricePerBatch) * 0.65;
        System.out.printf("%.2f leva.", bill);
    }
}

//100/100