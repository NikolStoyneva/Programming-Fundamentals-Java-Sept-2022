package FinalExam.ProgrammingFundamentals.FinalExam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?<delimiter>\\=|\\/)(?<destination>[A-Z][a-zA-Z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);

        List<String> validDestinations = new ArrayList<>();

        while (matcher.find()) {
            validDestinations.add(matcher.group("destination"));
        }

        int sum = 0;
        for (String destination : validDestinations) {
            sum += destination.length();
        }

        System.out.println("Destinations: " + String.join(", ", validDestinations));
        System.out.printf("Travel Points: %d%n", sum);
    }
}
