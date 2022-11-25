package TextProcessing.Exercise;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         StringBuilder input = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    input.deleteCharAt(j);
                    j--;
                } else {
                    break;
                }
            }
        }

        System.out.println(input);
    }
}
