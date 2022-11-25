package FinalExam.ProgrammingFundamentals.FinalExam01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01TheImitationGame {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            String[] commandElements = command.split("\\|");

            switch (commandElements[0]) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(commandElements[1]);
                    int removed = 0;

                    for (int i = 0; i < numberOfLetters; i++) {
                        inputList.add(inputList.get(i));
                        inputList.remove(i);
                        removed++;
                        i--;

                        if (removed == numberOfLetters) {
                            break;
                        }
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandElements[1]);
                    String value = commandElements[2];
                    int length = value.length();

                    for (int i = 0; i < length; i++) {
                        inputList.add(index, String.valueOf(value.charAt(i)));
                        index++;
                    }

                    break;
                case "ChangeAll":
                    String valueToChange = commandElements[1];
                    String replacement = commandElements[2];

                    for (int i = 0; i < inputList.size(); i++) {
                        if (inputList.get(i).equals(valueToChange)) {
                            inputList.set(i, replacement);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + String.join("", inputList));
    }
}
