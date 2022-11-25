package TextProcessing.MoreExercise;

import java.util.Scanner;

public class P01ExtractPersonInformation {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            StringBuilder personInformation = new StringBuilder();
            int firstIndexName = input.indexOf('@') + 1;
            int lastIndexName = input.indexOf('|');

            personInformation.append(input.substring(firstIndexName, lastIndexName));
            personInformation.append(" is ");

            int firstIndexAge = input.indexOf('#') + 1;
            int lastIndexAge = input.indexOf('*');

            personInformation.append(input.substring(firstIndexAge, lastIndexAge));
            personInformation.append(" years old.");

            System.out.println(personInformation);
        }

    }
}
