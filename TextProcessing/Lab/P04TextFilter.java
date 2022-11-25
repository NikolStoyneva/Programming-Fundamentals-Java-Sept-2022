package TextProcessing.Lab;

import java.util.Scanner;

public class P04TextFilter {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String[] bannedWords = scanner.nextLine().split(", ");
         String text = scanner.nextLine();

        for (int i = 0; i < bannedWords.length; i++) {
            String currentWord = bannedWords[i];
            int index = text.indexOf(currentWord);
            int length = currentWord.length();

           while (index >= 0) {
               text = text.replace(currentWord, repeatStars(length));
               index--;
           }
        }

        System.out.println(text);
    }
    public static String repeatStars (int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result += "*";
        }
        return result;
    }
}
