package Basic.Syntax.Conditional.Statements.And.Loops.Lab;

import java.util.Scanner;

public class P11MultiplicationTable2 {


    public static void main(String[] args) {
        Scanner scanner = new  Scanner (System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int result = 0;

        if (n2 > 10) {
            System.out.printf("%d X %d = %d%n", n1, n2, n1*n2);
        } else {
            for (int i = n2; i <= 10; i++) {
                result = n1 * i;
                System.out.printf("%d X %d = %d%n", n1, i, result);
            }
        }
    }
}
