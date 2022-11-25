package RegularExpressions.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02RageQuit {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?<allString>(?<text>[\\D]+)(?<number>[1-9][0-9]?))");
        Matcher matcher = pattern.matcher(input);

        StringBuilder message = new StringBuilder();
        List<Character> symbols = new ArrayList<>();
        while (matcher.find()) {
            String text = matcher.group("text").toUpperCase();
            int count = Integer.parseInt(String.valueOf(matcher.group("number")));
                for (int i = 0; i < text.length(); i++) {
                    if (!symbols.contains(text.charAt(i))) {
                        symbols.add(text.charAt(i));
                    }
                }
            for (int i = 0; i < count; i++) {
             message.append(text);
            }
        }

        System.out.printf("Unique symbols used: %d%n", symbols.size());
        System.out.println(message.toString().toUpperCase());
    }
}
