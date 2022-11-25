package FinalExam.ProgrammingFundamentals.FinalExam05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();

       int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                if (sum > 0) {
                    sum *= Integer.parseInt(String.valueOf(input.charAt(i)));
                } else {
                    sum = Integer.parseInt(String.valueOf(input.charAt(i)));
                }
            }
        }
        Pattern pattern = Pattern.compile("([\\\\*]{2}|[\\\\:]{2})(?<text>[A-Z]{1}[a-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);

        List<String> emojiList = new ArrayList<>();
        List<String> coolEmojiList = new ArrayList<>();

        while (matcher.find()) {
            String emoji = matcher.group();
            String currentText = matcher.group("text");
            emojiList.add(emoji);
            int currentSum = 0;
            for (int i = 0; i < currentText.length(); i++) {
                currentSum += currentText.charAt(i);
            }
            if (currentSum >= sum) {
                coolEmojiList.add(emoji);
            }
        }

        System.out.printf("Cool threshold: %d%n", sum);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojiList.size());
        for (String emoji : coolEmojiList) {
            System.out.println(emoji);
        }


    }
}
