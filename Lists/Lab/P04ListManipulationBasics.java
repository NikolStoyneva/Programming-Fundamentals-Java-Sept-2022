package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandElements = command.split(" ");

            if (commandElements[0].equals("Add")) {
                int number = Integer.parseInt(commandElements[1]);

                firstList.add(number);

            } else if (commandElements[0].equals("Remove")) {
                int number = Integer.parseInt(commandElements[1]);

                firstList.remove(Integer.valueOf(number));

            } else if (commandElements[0].equals("RemoveAt")) {
                int index = Integer.parseInt(commandElements[1]);

                firstList.remove(index);

            } else if (commandElements[0].equals("Insert")) {
                int number = Integer.parseInt(commandElements[1]);
                int index = Integer.parseInt(commandElements[2]);

                firstList.add(index, number);
            }
            command = scanner.nextLine();
        }

       for (int element : firstList) {
           System.out.print(element + " ");
       }
    }
}
