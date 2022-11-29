package L08_OldExams.E3_April2019_2;

import java.util.Scanner;

public class P04_EasterShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());
        int sold = 0;

        for (int i = 1; i > 0; i++) {

            String action = scanner.nextLine();

            if (action.equals("Close")) {

                System.out.println("Store is closed!");
                System.out.printf("%d eggs sold.", sold);
                break;

            }

            int number = Integer.parseInt(scanner.nextLine());

            if (action.equals("Buy")) {
                if (number > eggs) {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", eggs);
                    break;
                }
                eggs -= number;
                sold += number;

            } else if (action.equals("Fill")) {
                eggs += number;
            }

        }

    }
}

//100/100

// АЛТЕРНАТИВНО РЕШЕНИЕ (⚠️ с while loop вместо с for):

//package Exams.April2019_2;
//
//import java.util.Scanner;
//
//public class EasterShop_04 {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int eggs = Integer.parseInt(scanner.nextLine());
//        int sold = 0;
//
//        String input = scanner.nextLine();
//
//        while (!input.equals("Close")) {
//
//            int number = Integer.parseInt(scanner.nextLine());
//
//            if (input.equals("Buy")) {
//                    if (number > eggs) {
//                        System.out.println("Not enough eggs in store!");
//                        System.out.printf("You can buy only %d.", eggs);
//                        break;
//                    }
//
//                eggs -= number;
//                sold += number;
//
//            } else if (input.equals("Fill")) {
//                eggs += number;
//            }
//
//        input = scanner.nextLine();
//
//        }
//
//        if (input.equals("Close")) {
//            System.out.println("Store is closed!");
//            System.out.printf("%d eggs sold.", sold);
//        }
//
//    }
//}
//

//100/100