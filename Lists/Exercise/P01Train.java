package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandElements = command.split(" ");

            if (commandElements[0].equals("Add")) {
                int newWagon = Integer.parseInt(commandElements[1]);
                wagonsList.add(newWagon);

            } else {
                int passengersToAdd = Integer.parseInt(commandElements[0]);

                for (int i = 0; i < wagonsList.size(); i++) {
                    int freeSeats = maxCapacity - wagonsList.get(i);

                    if (freeSeats >= passengersToAdd) {
                        wagonsList.set(i, wagonsList.get(i) + passengersToAdd);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        System.out.println(wagonsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
