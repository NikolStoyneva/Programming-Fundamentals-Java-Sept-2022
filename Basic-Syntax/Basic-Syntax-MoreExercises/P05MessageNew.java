package Basic.Syntax.Conditional.Statements.And.Loops.More.Exercises;

import java.util.Scanner;

public class P05MessageNew {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String message = "";

        for (int i = 1; i <= n; i++) {
            String currentInput = scanner.nextLine();
            int length = currentInput.length();
            int digit = Integer.parseInt(currentInput);
            int mainDigit = digit % 10;

            if (mainDigit == 0) {
                message += " ";
            } else {
                int offset = (mainDigit - 2) * 3;

                if (mainDigit == 9 || mainDigit == 8) {
                    offset += 1;
                }

                int letterIndex = (offset + length - 1);

                char letter = (char) (letterIndex + 97);

                message += letter;
            }
        }
        System.out.println(message);
    }
}
