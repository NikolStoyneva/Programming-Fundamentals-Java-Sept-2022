package FinalExam.ProgrammingFundamentals.FinalExam05;

import java.util.Scanner;

public class P01ActivationKeys {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String key = scanner.nextLine();
         String command = scanner.nextLine();

         while (!command.equals("Generate")) {
             String[] commandElements = command.split(">>>");

             if (command.contains("Contains")) {
                 String substring = commandElements[1];

                 if (key.contains(substring)) {
                     System.out.println(key + " contains " + substring);
                 } else {
                     System.out.println("Substring not found!");
                 }

             } else if (command.contains("Flip")) {
                 int startIndex = Integer.parseInt(commandElements[2]);
                 int endIndex = Integer.parseInt(commandElements[3]);
                 String substring = key.substring(startIndex, endIndex);

                 if (commandElements[1].equals("Upper")) {
                     String replacement = key.substring(startIndex, endIndex).toUpperCase();
                     key = key.replace(substring, replacement);
                 } else if (commandElements[1].equals("Lower")) {
                     String replacement = key.substring(startIndex, endIndex).toLowerCase();
                     key = key.replace(substring, replacement);
                 }

                 System.out.println(key);
             } else if (command.contains("Slice")) {
                 int startIndex = Integer.parseInt(commandElements[1]);
                 int endIndex = Integer.parseInt(commandElements[2]);

                 String textToRemove = key.substring(startIndex, endIndex);
                 key = key.replace(textToRemove, "");

                 System.out.println(key);
             }

             command = scanner.nextLine();
         }

        System.out.printf("Your activation key is: %s%n", key);
    }
}
