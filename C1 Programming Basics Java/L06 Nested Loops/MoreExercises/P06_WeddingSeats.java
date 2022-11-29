package L06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P06_WeddingSeats {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String endSector = scanner.nextLine();
        int rows1stSector = Integer.parseInt(scanner.nextLine());
        int seatsPerOddRow = Integer.parseInt(scanner.nextLine());
        int countSectors = 0;
        int countSeats = 0;
        int seatsPerRow = 0;

        for (int sector = 'A'; sector <= endSector.charAt(0); sector++) {
            for (int row = 1; row <= rows1stSector + countSectors; row++) {
                if (row % 2 == 0) {
                    seatsPerRow = seatsPerOddRow + 2;
                } else {
                    seatsPerRow = seatsPerOddRow;
                }
                for (int seat = 'a'; seat <= 'a' + seatsPerRow - 1; seat++) {
                    System.out.printf("%c%d%c%n", sector, row, seat);
                    countSeats++;
                }
            }
            countSectors++;
        }

        System.out.println(countSeats);

    }
}

//100/100