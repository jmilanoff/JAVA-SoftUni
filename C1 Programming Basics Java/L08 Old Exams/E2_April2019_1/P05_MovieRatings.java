package L08_OldExams.E2_April2019_1;

import java.util.Scanner;

public class P05_MovieRatings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allMovies = Integer.parseInt(scanner.nextLine());
        String movie = scanner.nextLine();

        double totalScore = 0;
        int countMovies = 0;

        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;

        String bestMovie = "";
        String worstMovie = "";

        while (countMovies < allMovies) {

            double rating = Double.parseDouble(scanner.nextLine());
            totalScore += rating;
            countMovies++;
                if (rating > maxRating) {
                    maxRating = rating;
                    bestMovie = movie;
                }
                if (rating < minRating) {
                    minRating = rating;
                    worstMovie = movie;
                }

            if (countMovies < allMovies) {
                movie = scanner.nextLine();
            }
        }

        System.out.printf("%s is with highest rating: %.1f\n", bestMovie, maxRating);
        System.out.printf("%s is with lowest rating: %.1f\n", worstMovie, minRating);
        System.out.printf("Average rating: %.1f", totalScore / countMovies);

    }
}

//100/100