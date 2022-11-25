package TextProcessing.Lab;

import java.util.Scanner;

public class P05DigitsLettersAndOther {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();

         StringBuilder numbers = new StringBuilder();
         StringBuilder letters = new StringBuilder();
         StringBuilder symbols = new StringBuilder();


        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {
                numbers.append(currentChar);
            } else if (Character.isLetter(currentChar)) {
                letters.append(currentChar);
            } else {
                symbols.append(currentChar);
            }
        }

        System.out.println(String.join("", numbers));
        System.out.println(String.join("", letters));
        System.out.println(String.join("", symbols));
    }
}
