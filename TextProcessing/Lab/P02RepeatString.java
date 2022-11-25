package TextProcessing.Lab;

import java.util.Scanner;

public class P02RepeatString {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String[] stringArr = scanner.nextLine().split(" ");
         StringBuilder repeatedStrings = new StringBuilder();

        for (int i = 0; i < stringArr.length; i++) {
            String currentWord = stringArr[i];

            for (int j = 0; j < currentWord.length(); j++) {
                repeatedStrings.append(currentWord);
            }
        }

        System.out.println(String.join("", repeatedStrings));
    }
}
