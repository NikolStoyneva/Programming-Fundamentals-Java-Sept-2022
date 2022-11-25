package MidExam.ProgrammingFundamentals.MidExam01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner (System.in);

        List<String> inputLine = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();
        int turns = 0;

        boolean noMoreMatchingElements = true;

        while (!command.equals("end")) {
            String[] commandElements = command.split(" ");
            turns++;

            int firstIndexInput = Integer.parseInt(commandElements[0]);
            int secondIndexInput = Integer.parseInt(commandElements[1]);

            int firstIndex = Math.max(firstIndexInput, secondIndexInput);
            int secondIndex = Math.min(firstIndexInput, secondIndexInput);

            if (isValidIndex(inputLine, firstIndex) && isValidIndex(inputLine, secondIndex) && firstIndex != secondIndex) {
                if (inputLine.get(firstIndex).equals(inputLine.get(secondIndex))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", inputLine.get(secondIndex));
                    inputLine.remove(firstIndex);
                    inputLine.remove(secondIndex);
                } else {
                    System.out.println("Try again!");
                }
            } else {
                String toAdd = "-" + turns + "a";
                int middleIndex = inputLine.size() / 2;
                inputLine.add(middleIndex, toAdd);
                inputLine.add(middleIndex + 1, toAdd);

                System.out.println("Invalid input! Adding additional elements to the board");
            }

            noMoreMatchingElements = true;

            for (int i = 0; i < inputLine.size(); i++) {
                for (int j = i + 1; j < inputLine.size(); j++) {
                    if (inputLine.get(i).equals(inputLine.get(j))) {
                        noMoreMatchingElements = false;
                        break;
                    }
                }
                if (!noMoreMatchingElements) {
                    break;
                }
            }

            if (noMoreMatchingElements) {
                System.out.printf("You have won in %d turns!%n", turns);
                break;
            }

            command = scanner.nextLine();
        }

        if (!noMoreMatchingElements) {
            System.out.println("Sorry you lose :(");
            System.out.println(inputLine.toString().replaceAll("[\\[\\],]", ""));
        }
    }
    public static boolean isValidIndex (List<String> inputLine, int index) {
        return (index >= 0 && index < inputLine.size());
    }
}
