package L08_OldExams.E5_June2019;

import java.util.Scanner;

public class P01_SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodesPerSeason = Integer.parseInt(scanner.nextLine());
        double episodeDurationNoAds = Double.parseDouble(scanner.nextLine());

        double episodeDurationWithAds = episodeDurationNoAds * 1.2;

        double totalTime = seasons * episodesPerSeason * episodeDurationWithAds;

        System.out.printf("Total time needed to watch the %s series is %d minutes.", name, Math.round(totalTime + seasons * 10));
    }
}

//100/100