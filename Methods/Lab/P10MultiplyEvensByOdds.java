package Methods.Lab;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultipleOfEvenAndOdds(number));

    }
    public static int getMultipleOfEvenAndOdds (int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);

        return evenSum * oddSum;
    }
    public static int getSumOfEvenDigits (int inputNumber) {
        int oddSum = 0;
        int number = Math.abs(inputNumber);

        while (number > 0) {
            int currentNum = number % 10;
            if (currentNum % 2 != 0) {
                oddSum += currentNum;
            }
            number /= 10;
        }

        return oddSum;
    }
    public static int getSumOfOddDigits (int inputNumber) {
        int evenSum = 0;
        int number = Math.abs(inputNumber);

        while (number > 0) {
            int currentNum = number % 10;
            if (currentNum % 2 == 0) {
                evenSum += currentNum;
            }
            number /= 10;
        }

        return evenSum;
    }
}
