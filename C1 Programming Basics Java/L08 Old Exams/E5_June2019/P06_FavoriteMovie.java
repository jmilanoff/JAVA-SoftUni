package L08_OldExams.E5_June2019;

import java.util.Scanner;

public class P06_FavoriteMovie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int count = 0;
        int maxPoints = 0;
        String leader = "";

        while (!movie.equals("STOP")) {
            count++;
            int currentPoints = 0;

            for (int i = 0; i < movie.length(); i++) {
                    if (movie.charAt(i) >= 65 && movie.charAt(i) <= 90) {
                        currentPoints += movie.charAt(i) - movie.length();
                    } else if (movie.charAt(i) >= 97 && movie.charAt(i) <= 122){
                        currentPoints += movie.charAt(i) - 2 * movie.length();
                    } else {
                        currentPoints += movie.charAt(i);
                    }
            }

            if (currentPoints > maxPoints) {
                maxPoints = currentPoints;
                leader = movie;
            }

            if (count == 7) {
                System.out.println("The limit is reached.");
                break;
            }

            movie = scanner.nextLine();
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.", leader, maxPoints);
    }
}

//100/100 (⚠️ бях забравил, че интервала също е символ от ASCII таблицата и е отделен случай)