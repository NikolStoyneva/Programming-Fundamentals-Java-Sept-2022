package Methods.Exercise;

import java.util.Scanner;

public class P10TopNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            if (isSumDivisibleBy8(i) && isNumberHasOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isSumDivisibleBy8 (int number) {
        int sum = 0;

        while (number > 0) {
            int currentDigit = number % 10;
            sum += currentDigit;
            number /= 10;
        }
        return sum % 8 == 0;
    }

    public static boolean isNumberHasOddDigit (int number) {
        int oddDigits = 0;

        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit % 2 != 0) {
                oddDigits++;
                break;
            }
            number /= 10;
        }
        return oddDigits > 0;
    }
}
