package L05_WhileLoops.MoreExercises;

public class P04_NumbersDividedBy3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }

    }
}

//100/100

//АЛТЕРНАТИВНО РЕШЕНИЕ С WHILE LOOP:

//package WhileLoops_5.MoreExercises;
//
//public class Demo {
//
//    public static void main(String[] args) {
//
//        int i = 1;
//
//        while (i <= 100) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//    }
//}