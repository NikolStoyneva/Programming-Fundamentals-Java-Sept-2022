package TextProcessing.Exercise;

import java.util.Scanner;

public class P05MultiplyBigNumber {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String firstNumber = scanner.nextLine().replaceFirst("^0+(?!$)", "");
         int secondNumber = Integer.parseInt(scanner.nextLine());

         int remainder = 0;

         StringBuilder result = new StringBuilder();
         if (secondNumber > 0) {
             for (int i = firstNumber.length() - 1; i >= 0; i--) {
                 int currentNum = Integer.parseInt(String.valueOf(firstNumber.charAt(i))) * secondNumber + remainder;
                 if (currentNum <= 9) {
                     result.append(currentNum);
                     remainder = 0;
                 } else {
                     result.append(currentNum % 10);
                     currentNum /= 10;
                     remainder = currentNum;
                 }
             }
             if (remainder > 0) {
                 result.append(remainder);
             }
             System.out.println(result.reverse());
         } else {
             System.out.println("0");
         }
    }
}
