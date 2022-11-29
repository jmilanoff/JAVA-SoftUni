package L09_PreliminaryExam;

import java.util.Scanner;

public class P01_Excursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int people = Integer.parseInt(scanner.nextLine());
    int nights = Integer.parseInt(scanner.nextLine());
    int cards = Integer.parseInt(scanner.nextLine());
    int tickets = Integer.parseInt(scanner.nextLine());

    double billPerPerson = nights * 20 + cards * 1.60 + tickets * 6;
    double groupBill = people * billPerPerson;

    double finalGroupBill = groupBill * 1.25;

        System.out.printf("%.2f", finalGroupBill);
    }
}

//100/100