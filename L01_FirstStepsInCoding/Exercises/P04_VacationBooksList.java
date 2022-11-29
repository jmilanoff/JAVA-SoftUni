package L01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P04_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysPerBook = Integer.parseInt(scanner.nextLine());

        int result = (pages / pagesPerHour) / daysPerBook;

        System.out.println(result);

    }
}
