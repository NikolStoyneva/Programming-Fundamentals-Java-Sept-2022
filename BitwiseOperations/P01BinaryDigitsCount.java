package BitwiseOperations;

import java.util.Scanner;

public class P01BinaryDigitsCount {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int number = Integer.parseInt(scanner.nextLine());
         int digit = Integer.parseInt(scanner.nextLine());

         int counter = 0;

         while (number > 0) {
             int currentDigit = number % 2;
             if (currentDigit == digit) {
                counter++;
            }
             number /= 2;
        }

        System.out.println(counter);

    }
}
