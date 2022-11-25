package MidExam.ProgrammingFundamentals.MidExam03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetsList = new java.util.ArrayList<>(Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList()));

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandElements = command.split(" ");

            if (commandElements[0].equals("Shoot")) {
                int indexToShoot = Integer.parseInt(commandElements[1]);
                int shootingPower = Integer.parseInt(commandElements[2]);

                if (isValidIndex(targetsList, indexToShoot)) {
                    int currentValue = targetsList.get(indexToShoot);

                    targetsList.set(indexToShoot, currentValue - shootingPower);

                    if (targetsList.get(indexToShoot) <= 0) {
                        targetsList.remove(indexToShoot);
                    }
                }

            } else if (commandElements[0].equals("Add")) {
                int indexToAdd = Integer.parseInt(commandElements[1]);
                int valueToAdd = Integer.parseInt(commandElements[2]);

                if (isValidIndex(targetsList, indexToAdd)) {
                    targetsList.add(indexToAdd, valueToAdd);
                } else {
                    System.out.println("Invalid placement!");
                }

            } else if (commandElements[0].equals("Strike")) {
                int indexToStrike = Integer.parseInt(commandElements[1]);
                int radius = Integer.parseInt(commandElements[2]);



                if (isValidIndex(targetsList, indexToStrike) && isValidIndex(targetsList, indexToStrike - radius) && isValidIndex(targetsList, indexToStrike + radius)) {

                    int count = radius * 2 + 1;

                    for (int i = indexToStrike - radius; i <= indexToStrike + radius; i++) {
                       targetsList.remove(i);
                       i--;
                       count--;

                        if (count == 0) {
                            break;
                        }
                    }
                } else {
                    System.out.println("Strike missed!");
                }
            }


            command = scanner.nextLine();
        }

        System.out.println(targetsList.toString().replaceAll("[\\[\\],]", "").replace(" ", "|"));
    }
    public static boolean isValidIndex (List<Integer> numbers, int index) {
        return (index >= 0 && index < numbers.size());
    }
}
