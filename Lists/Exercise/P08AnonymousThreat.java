package Lists.Exercise;

import java.util.List;
import java.util.Scanner;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = new java.util.ArrayList<>(List.of(scanner.nextLine().split(" ")));

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] commandElements = command.split(" ");

            if (commandElements[0].equals("merge")) {
                int startIndex = Integer.parseInt(commandElements[1]);
                int endIndex = Integer.parseInt(commandElements[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex >= inputList.size()) {
                    endIndex = inputList.size() - 1;
                }

                boolean isValidIndex = endIndex >= 0 && startIndex < inputList.size();

                if (isValidIndex) {
                    String mergedString = "";

                    for (int i = startIndex; i <= endIndex; i++) {
                        mergedString += inputList.get(i);
                    }

                    for (int i = startIndex; i <= endIndex; i++) {
                        inputList.remove(startIndex);
                    }

                    inputList.add(startIndex, mergedString);
                }
            } else {
                int index = Integer.parseInt(commandElements[1]);
                int parts = Integer.parseInt(commandElements[2]);

                String textToDivide = inputList.get(index);
                int lengthElement = textToDivide.length();

                int partSize = lengthElement / parts;

                inputList.remove(index);

                int begining = 0;

                for (int i = 1; i < parts; i++) {
                    inputList.add(index, textToDivide.substring(begining, begining + partSize));
                    begining += partSize;
                    index++;
                }

               inputList.add(index, textToDivide.substring(begining));

            }

            command = scanner.nextLine();
        }

        System.out.println(String.join(" ", inputList));
    }
}
