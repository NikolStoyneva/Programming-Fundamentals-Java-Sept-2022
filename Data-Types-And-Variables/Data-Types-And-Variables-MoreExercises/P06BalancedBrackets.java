package Data.Types.And.Variables.More.Exercise;

import java.util.Scanner;

public class P06BalancedBrackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int open = 0;
        int close = 0;

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                open++;
            } else if (input.equals(")") && open < 1) {
                close++;
                break;
            } else if (input.equals(")")) {
                close++;
            }

            if (close > open) {
                break;
            }
        }

        boolean isBalanced = open == close;

        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}

