package FinalExam.ProgrammingFundamentals.FinalExam02;

import java.util.*;

public class P01WorldTour {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         StringBuilder stops = new StringBuilder(scanner.nextLine());
         String command = scanner.nextLine();

         while (!command.equals("Travel")) {
             String[] commandElements = command.split("\\:");

             if (commandElements[0].contains("Add Stop")) {
                 int index = Integer.parseInt(commandElements[1]);
                 String destinationToAdd = commandElements[2];
                 StringBuilder updatedStops = new StringBuilder();

                 if (index >= 0 && index <= stops.length()) {
                     stops.insert(index, destinationToAdd);
                 }

                 System.out.println(String.join("", stops));
             } else if (commandElements[0].contains("Remove Stop")) {
                 int startIndex = Integer.parseInt(commandElements[1]);
                 int finalIndex = Integer.parseInt(commandElements[2]);

                 if ((startIndex >= 0 && startIndex < stops.length()) && (finalIndex >= 0 && finalIndex < stops.length())) {
                     stops.replace(startIndex, finalIndex + 1, "");
                 }

                 System.out.println(String.join("", stops));
             } else if (commandElements[0].contains("Switch")) {
                 String oldString = commandElements[1];
                 String newString = commandElements[2];

                 int index = stops.indexOf(oldString);
                 stops.replace(stops.indexOf(oldString), stops.indexOf(oldString) + oldString.length(), newString);

                 System.out.println(String.join("", stops));
             }
             command = scanner.nextLine();
         }

        System.out.printf("Ready for world tour! Planned stops: %s%n", stops);
    }
}
