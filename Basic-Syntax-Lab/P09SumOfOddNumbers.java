package Basic.Syntax.Conditional.Statements.And.Loops.Lab;

import java.util.Scanner;

public class P09SumOfOddNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int printed = 0;
        int sum = 0;

        for (int i = 1; i <= 1000000; i+=2) {
            System.out.println(i);
            printed++;
            sum += i;
            if (printed == n) {
                break;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
