package Lists.Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandElements = command.split(" ");

            switch (commandElements[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandElements[1]);

                    numbersList.add(numberToAdd);

                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandElements[1]);
                    int indexToInsert = Integer.parseInt(commandElements[2]);

                    if (isValidIndex(numbersList, indexToInsert)) {
                        numbersList.add(indexToInsert, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(commandElements[1]);

                    if (isValidIndex(numbersList, indexToRemove)) {
                        numbersList.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String leftRight = commandElements[1];
                    int count = Integer.parseInt(commandElements[2]);

                    if (leftRight.equals("left")) {

                        for (int i = 0; i < count; i++) {
                            int firstNum = numbersList.get(0);
                             numbersList.add(firstNum);
                             numbersList.remove(0);
                        }

                    } else {
                        for (int i = 0; i < count; i++) {
                            int lastNum = numbersList.get(numbersList.size() - 1);
                            numbersList.add(0, lastNum);
                            numbersList.remove(numbersList.size() - 1);
                        }

                    }
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
    public static boolean isValidIndex (List<Integer> numbers, int index) {
        return (index >= 0 && index <= numbers.size() - 1);
    }
}
