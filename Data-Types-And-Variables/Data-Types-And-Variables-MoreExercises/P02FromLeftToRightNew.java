package Data.Types.And.Variables.More.Exercise;

import java.util.Scanner;

public class P02FromLeftToRightNew {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            long num1 = Long.parseLong(scanner.next());
            long num2 = Long.parseLong(scanner.next());

            if (num1 > num2) {
                long n1 = Math.abs(num1);
                int sum1 = 0;

                while (n1 > 0) {
                    sum1 += n1 % 10;
                    n1 /= 10;
                }

                System.out.println(sum1);
            } else {
                long n2 = Math.abs(num2);
                int sum2 = 0;

                while (n2 > 0) {
                    sum2 += n2 % 10;
                    n2 /= 10;
                }

                System.out.println(sum2);
            }
        }
    }
}
