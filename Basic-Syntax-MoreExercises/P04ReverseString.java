package Basic.Syntax.Conditional.Statements.And.Loops.More.Exercises;

import java.util.Scanner;

public class P04ReverseString {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            String output = new StringBuilder(input).reverse().toString();

            System.out.println(output);
        }
}
