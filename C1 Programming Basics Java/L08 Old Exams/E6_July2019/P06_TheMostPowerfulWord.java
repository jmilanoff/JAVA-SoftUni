package L08_OldExams.E6_July2019;

import java.util.Scanner;

public class P06_TheMostPowerfulWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int maxPoints = 0;
        String mostPowerful = "";

        while (!word.equals("End of words")) {
            int totalPoints = 0;

            for (int i = 0; i < word.length(); i++) {
                int currentPoints = word.charAt(i);
                totalPoints += currentPoints;
            }

            if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i'
                    || word.charAt(0) == 'o' || word.charAt(0) == 'u' || word.charAt(0) == 'y'
                    || word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I'
                    || word.charAt(0) == 'O' || word.charAt(0) == 'U' || word.charAt(0) == 'Y') {

                totalPoints *= word.length();

            } else {
                totalPoints /= Math.floor(word.length());
            }

            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                mostPowerful = word;
            }

            word = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %d", mostPowerful, maxPoints);
    }
}

//100/100