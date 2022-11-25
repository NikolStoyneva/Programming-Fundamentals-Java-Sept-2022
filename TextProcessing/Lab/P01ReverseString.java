package TextProcessing.Lab;

import java.util.Scanner;

public class P01ReverseString {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command = scanner.nextLine();

         while (!command.equals("end")) {
             String currentWord = command;
             StringBuilder reversedWord = new StringBuilder();

             for (int i = currentWord.length() - 1; i >= 0; i--) {
                 reversedWord.append(currentWord.charAt(i));
             }

             System.out.printf("%s = %s%n", currentWord, reversedWord);
             command = scanner.nextLine();
         }
    }
}
