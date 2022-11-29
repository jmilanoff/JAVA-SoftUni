package L08_OldExams.E5_June2019;

import java.util.Scanner;

public class P04_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int turns = 1000000;
        int leftSeats = capacity;
        int income = 0;
        String text = "";

        for (int i = 1; i <= turns ; i++) {
            text = scanner.nextLine();

            if (text.equals("Movie time!")) {
                break;
            } else {
                int people = Integer.parseInt(text);

                if (people > leftSeats) {
                    System.out.println("The cinema is full.");
                    break;
                }

                int bill = 0;

                if (people % 3 == 0) {
                    bill = people * 5 - 5;
                } else {
                    bill = people * 5;
                }

                income += bill;
                leftSeats -= people;
            }

        }

        if (text.equals("Movie time!")) {
            System.out.printf("There are %d seats left in the cinema.\n", leftSeats);
        }
        System.out.printf("Cinema income - %d lv.", income);

    }
}

//100/100