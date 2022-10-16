package Arrays.More.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06LadyBugs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        int[] positions = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] ladyBugsArr = new int[length];

        for (int i = 0; i < positions.length; i++) {
            if (positions[i] >= 0 && positions[i] < ladyBugsArr.length) {
                for (int j = 0; j < length; j++) {
                    if (j == positions[i]) {
                        ladyBugsArr[j] = 1;
                    }
                }
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandElements = command.split(" ");

            int startIndex = Integer.parseInt(commandElements[0]);
            String leftRight = commandElements[1];
            int steps = Integer.parseInt(commandElements[2]);

            if (startIndex < 0 || startIndex > ladyBugsArr.length - 1 || ladyBugsArr[startIndex] != 1) {
                command = scanner.nextLine();
                continue;
            } else {
                if (steps < 0) {
                    if (leftRight.equals("right")) {
                            leftRight = "left";
                    } else if (leftRight.equals("left")) {
                            leftRight = "right";
                        }
                    }

                    steps = Math.abs(steps);

                ladyBugsArr[startIndex] = 0;

                    if (leftRight.equals("left")) {

                            for (int j = startIndex - steps; j >= 0; j-=steps) {
                                    if (ladyBugsArr[j] == 0) {
                                        ladyBugsArr[j] = 1;
                                        break;
                                    }
                            }

                    } else if (leftRight.equals("right")) {

                        for (int j = startIndex + steps; j < ladyBugsArr.length; j+=steps) {
                            if (ladyBugsArr[j] == 0) {
                                ladyBugsArr[j] = 1;
                                break;
                            }
                        }
                    }
                }

        command = scanner.nextLine();
    }

        for (int item : ladyBugsArr) {
            System.out.print(item + " ");
        }
    }
}
