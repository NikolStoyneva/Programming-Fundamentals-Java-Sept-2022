package TextProcessing.Exercise;

import java.util.Scanner;

public class P02CharacterMultiplier {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String[] inputArr = scanner.nextLine().split(" ");
         String firstInput = inputArr[0];
         String secondInput = inputArr[1];
         int firstLength = firstInput.length();
         int secondLength = secondInput.length();

         int sumCharacters = 0;
         if (firstLength == secondLength) {
             for (int i = 0; i < firstInput.length(); i++) {
                 sumCharacters += firstInput.charAt(i) * secondInput.charAt(i);
             }
         } else if (firstLength < secondLength) {
             for (int i = 0; i < firstLength; i++) {
                 sumCharacters += firstInput.charAt(i) * secondInput.charAt(i);
             }

             for (int i = firstLength; i < secondLength; i++) {
                 sumCharacters += secondInput.charAt(i);
             }
         } else {
             for (int i = 0; i < secondLength; i++) {
                 sumCharacters += firstInput.charAt(i) * secondInput.charAt(i);
             }

             for (int i = secondLength; i < firstLength; i++) {
                 sumCharacters += firstInput.charAt(i);
             }
         }

        System.out.println(sumCharacters);
    }
}
