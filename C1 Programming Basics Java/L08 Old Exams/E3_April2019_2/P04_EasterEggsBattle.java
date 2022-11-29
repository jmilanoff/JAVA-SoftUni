package L08_OldExams.E3_April2019_2;

import java.util.Scanner;

public class P04_EasterEggsBattle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p1Eggs = Integer.parseInt(scanner.nextLine());
        int p2Eggs = Integer.parseInt(scanner.nextLine());
        int turns = 1000000;

        for (int i = 1; i <= turns; i++) {
            String winner = scanner.nextLine();

            if (winner.equals("End")) {
                System.out.printf("Player one has %d eggs left.\n", p1Eggs);
                System.out.printf("Player two has %d eggs left.", p2Eggs);
                break;

            } else if (winner.equals("one")) {
                p2Eggs--;
                if (p2Eggs == 0) {
                    System.out.printf("Player two is out of eggs. Player one has %d eggs left.", p1Eggs);
                    break;
                }

            } else if (winner.equals("two")) {
                p1Eggs--;
                if (p1Eggs == 0) {
                    System.out.printf("Player one is out of eggs. Player two has %d eggs left.", p2Eggs);
                    break;
                }
            }

        }

    }
}


//100/100

// АЛТЕРНАТИВНО РЕШЕНИЕ (⚠️ с while цикъл, вместо с for)

//package Exams.April2019_2;
//
//import java.util.Scanner;
//
//public class EasterEggsBattle_04 {
//
//  public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int p1Eggs = Integer.parseInt(scanner.nextLine());
//        int p2Eggs = Integer.parseInt(scanner.nextLine());
//
//        String winner = scanner.nextLine();
//
//        while (!winner.equals("End")) {
//
//            if (winner.equals("one")) {
//                p2Eggs--;
//                if (p2Eggs == 0) {
//                    System.out.printf("Player two is out of eggs. Player one has %d eggs left.", p1Eggs);
//                    break;
//                }
//
//            } else if (winner.equals("two")) {
//                p1Eggs--;
//                if (p1Eggs == 0) {
//                    System.out.printf("Player one is out of eggs. Player two has %d eggs left.", p2Eggs);
//                    break;
//                }
//            }
//
//        winner = scanner.nextLine();
//
//        }
//
//        if (winner.equals("End")) {
//            System.out.printf("Player one has %d eggs left.\n", p1Eggs);
//            System.out.printf("Player two has %d eggs left.", p2Eggs);
//        }
//
//    }
//}