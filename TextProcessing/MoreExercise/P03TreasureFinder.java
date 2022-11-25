package TextProcessing.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03TreasureFinder {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int[] key = Arrays.stream(scanner.nextLine().split(" "))
                 .mapToInt(Integer::parseInt).toArray();
         String command = scanner.nextLine();

         while (!command.equals("find")) {
             String text = command;
             StringBuilder decryptedText = new StringBuilder();
             int keyPosition = 0;

             for (int i = 0; i < text.length(); i++) {
                 char currentChar = (char) (text.charAt(i) - key[keyPosition]);
                 decryptedText.append(currentChar);
                 keyPosition++;
                 if (keyPosition == key.length) {
                     keyPosition = 0;
                 }
             }

             int firstIndexTreasure = decryptedText.indexOf("&") + 1;
             int lastIndexTreasure = decryptedText.lastIndexOf("&");
             int firstIndexCoordinates = decryptedText.indexOf("<") + 1;
             int lastIndexCoordinates = decryptedText.indexOf(">");

             System.out.printf("Found %s at %s%n", decryptedText.subSequence(firstIndexTreasure, lastIndexTreasure), decryptedText.subSequence(firstIndexCoordinates, lastIndexCoordinates));

             command = scanner.nextLine();
         }
    }
}
