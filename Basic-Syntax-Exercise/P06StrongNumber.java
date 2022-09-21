package Basic.Syntax.Conditional.Statements.And.Loops.Exercise;

import java.util.Scanner;

public class P06StrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        int n = inputNum;

        int total = 0;

        while (n > 0) {
            int digit = n % 10;
            int sum = 1;

            for (int i = 2; i <= digit; i++) {
                sum *= i;
            }
            n /= 10;
            total += sum;
        }

        if (inputNum == total) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
