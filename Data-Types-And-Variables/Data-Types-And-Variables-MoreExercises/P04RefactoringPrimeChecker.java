package Data.Types.And.Variables.More.Exercise;

import java.util.Scanner;

public class P04RefactoringPrimeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= n; i++) {
            int currentNum = i;

            int counter = 0;

            for (int j = 2; j <= i; j++) {
                if (currentNum % j == 0) {
                    counter++;
                }
            }

            boolean isPrime = counter < 2;

            if (isPrime) {
                System.out.printf("%d -> %b%n", currentNum, isPrime);
            } else {
                System.out.printf("%d -> %b%n", currentNum, isPrime);
            }
        }

    }
}
