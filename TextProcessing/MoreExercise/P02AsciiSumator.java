package TextProcessing.MoreExercise;

import java.util.Scanner;

public class P02AsciiSumator {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         char firstChar = scanner.nextLine().charAt(0);
         char lastChar = scanner.nextLine().charAt(0);
         String text = scanner.nextLine();

         int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (currentChar > firstChar && currentChar < lastChar) {
                sum += (int) currentChar;
            }
        }

        System.out.println(sum);
    }
}
