package FinalExam.ProgrammingFundamentals.FinalExam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([\\@|\\#])(?<word1>[A-Za-z]{3,})\\1{2}(?<word2>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(input);

        List<String> firstWord = new ArrayList<>();
        List<String> secondWord = new ArrayList<>();

        while (matcher.find()) {
            String word1 = matcher.group("word1");
            String word2 = matcher.group("word2");
            firstWord.add(word1);
            secondWord.add(word2);
        }

        List<String> validPairs = new ArrayList<>();

        for (int i = 0; i < firstWord.size(); i++) {
            String currentFirst = firstWord.get(i);
            String currentSecond = "";
            for (int j = secondWord.get(i).length() - 1; j >= 0; j--) {
                currentSecond += secondWord.get(i).charAt(j);
            }
            if (currentFirst.equals(currentSecond)) {
                String pair = currentFirst + " <=> " + secondWord.get(i);
                validPairs.add(pair);
            }
        }

        if (firstWord.size() == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", firstWord.size());
        }
        if (validPairs.size() > 0) {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", validPairs));
        } else {
            System.out.println("No mirror words!");
        }

    }
}
