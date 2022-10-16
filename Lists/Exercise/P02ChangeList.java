package Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P02ChangeList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        
        String command = scanner.nextLine();
        
        while (!command.equals("end")) {
            String[] commandElements = command.split(" ");
            
            if (commandElements[0].equals("Delete")) {
                int elementToDelete = Integer.parseInt(commandElements[1]);

                while (numbersList.contains(elementToDelete)) {
                    numbersList.remove(Integer.valueOf(elementToDelete));
                }


            } else if (commandElements[0].equals("Insert")) {
                int elementToInsert = Integer.parseInt(commandElements[1]);
                int index = Integer.parseInt(commandElements[2]);

                numbersList.add(index, elementToInsert);

            }

            command = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
