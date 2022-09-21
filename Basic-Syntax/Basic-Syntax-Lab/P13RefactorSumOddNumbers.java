package Basic.Syntax.Conditional.Statements.And.Loops.Lab;

import java.util.Scanner;

public class P13RefactorSumOddNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;

        for (int i = 1; i <= 10000000; i+=2) {
            System.out.println(i);
            counter++;
            sum += i;
            if (counter == n) {
                break;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
