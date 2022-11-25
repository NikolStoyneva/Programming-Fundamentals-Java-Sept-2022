package TextProcessing.Exercise;

import java.util.Scanner;

public class P08LettersChangeNumbers {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String[] inputArr = scanner.nextLine().split("\\s+");

         double totalSum = 0;

         for (String element : inputArr) {
             char firstLetter = element.charAt(0);
             char lastLetter = element.charAt(element.length() - 1);
             double num = Double.parseDouble(String.valueOf(element.substring(1, element.length() - 1)));

             if (Character.isUpperCase(firstLetter)) {
                 num /= (int) firstLetter - 64;
             } else {
                 num *= (int) firstLetter - 96;
             }

             if (Character.isUpperCase(lastLetter)) {
                 num -= (int) lastLetter - 64;
             } else {
                 num += (int) lastLetter - 96;
             }
             totalSum += num;
         }

        System.out.printf("%.2f", totalSum);
    }
}
