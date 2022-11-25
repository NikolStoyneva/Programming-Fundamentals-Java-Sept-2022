package MidExam.ProgrammingFundamentals.MidExam05;

import java.util.List;
import java.util.Scanner;

public class P03Inventory {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<String> inputList = new java.util.ArrayList<>(List.of(scanner.nextLine().split(", ")));

        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String[] commandElements = command.split(" - ");

            if (commandElements[0].equals("Collect")) {
                String itemToCollect = commandElements[1];

                if (!inputList.contains(itemToCollect)) {
                    inputList.add(itemToCollect);
                }

            } else if (commandElements[0].equals("Drop")) {
                String itemToDrop = commandElements[1];

                if (inputList.contains(itemToDrop)) {
                    inputList.remove(itemToDrop);
                }

            } else if (commandElements[0].equals("Combine Items")) {
                String[] combineItemsList = commandElements[1].split(":");
                String oldItem = combineItemsList[0];
                String newItem = combineItemsList[1];

                if (inputList.contains(oldItem)) {

                    for (int i = 0; i < inputList.size(); i++) {
                        if (inputList.get(i).equals(oldItem)) {
                            inputList.add(i + 1, newItem);
                            break;
                        }
                    }
                }
            } else if (commandElements[0].equals("Renew")) {
                String itemToRenew = commandElements[1];

                if (inputList.contains(itemToRenew)) {

                    inputList.remove(itemToRenew);
                    inputList.add(itemToRenew);
                }
            }

            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", inputList));
    }
}
