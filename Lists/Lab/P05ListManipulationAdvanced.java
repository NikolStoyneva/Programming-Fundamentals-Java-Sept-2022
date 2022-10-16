package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandElements = command.split(" ");

            switch (commandElements[0]) {
                case "Contains":
                    int number = Integer.parseInt(commandElements[1]);

                    if (numberList.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = commandElements[1];

                    if (evenOrOdd.equals("even")) {
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) % 2 == 0) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else {
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) % 2 != 0) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;

                    for (int i = 0; i < numberList.size(); i++) {
                        sum += numberList.get(i);
                    }

                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = commandElements[1];
                    int numberFilter = Integer.parseInt(commandElements[2]);

                    if (condition.equals(">=")) {
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) >= numberFilter) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (condition.equals("<")){
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) < numberFilter) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (condition.equals(">")) {
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) > numberFilter) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (condition.equals("<=")) {
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) <= numberFilter) {
                                System.out.print(numberList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
