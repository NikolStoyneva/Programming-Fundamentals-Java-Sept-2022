package FinalExam.ProgrammingFundamentals.FinalExam03;

import java.util.Scanner;

public class P01SecretChat {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String message = scanner.nextLine();
         String command = scanner.nextLine();

         while (!command.equals("Reveal")) {
             String[] commandElements = command.split("(\\:)(\\|)(\\:)");
             StringBuilder updatedMessage = new StringBuilder();

             if (commandElements[0].equals("InsertSpace")) {
                 int index = Integer.parseInt(commandElements[1]);

                 if (index >= 0 && index < message.length()) {
                     updatedMessage.append(message, 0, index);
                     updatedMessage.append(" ");
                     updatedMessage.append(message.substring(index));

                     message = updatedMessage.toString();
                     System.out.println(message);
                 }
             } else if (commandElements[0].equals("Reverse")) {
                 String substring = commandElements[1];
                 StringBuilder reversedString = new StringBuilder(substring).reverse();

                 if (message.contains(substring)) {
                     message = message.replaceFirst(substring.toString(), "");
                     message += reversedString.toString();
                     System.out.println(message);
                 } else {
                     System.out.println("error");
                 }
             } else if (commandElements[0].equals("ChangeAll")) {
                 String substring = commandElements[1];
                 String replacement = commandElements[2];

                 if (message.contains(substring)) {
                     int index = message.indexOf(substring);
                     while (index != -1) {
                         message = message.replace(substring, replacement);
                         index = message.indexOf(substring);
                     }
                     System.out.println(message);
                 }
             }
             command = scanner.nextLine();
         }

        System.out.println("You have a new text message: " + message);
    }
}
