package Methods.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06ArrayManipulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandElements = command.split(" ");

            switch (commandElements[0]) {
                case "exchange":
                    int index = Integer.parseInt(commandElements[1]);

                    if (index >= 0 && index < numbersArr.length) {
                        int[] exchangedArr = new int[numbersArr.length];

                        for (int i = 0; i < exchangedArr.length - (index + 1); i++) {
                            exchangedArr[i] = numbersArr[index + i + 1];
                        }
                        int position = 0;
                        for (int i = exchangedArr.length - (index + 1); i < exchangedArr.length; i++) {
                            exchangedArr[i] = numbersArr[position];
                            position++;
                        }
                        numbersArr = exchangedArr;
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String evenOrOddMax = commandElements[1];

                    if (evenOrOddMax.equals("even")) {
                        printEvenMaxIndex(numbersArr);
                    } else {
                        printOddMaxIndex(numbersArr);
                    }

                    break;
                case "min":
                    String evenOrOddMin = commandElements[1];

                    if (evenOrOddMin.equals("even")) {
                        printEvenMinIndex(numbersArr);
                    } else {
                        printOddMinIndex(numbersArr);
                    }

                    break;
                case "first":
                    int countFirst = Integer.parseInt(commandElements[1]);

                    if (countFirst <= numbersArr.length) {

                        if (commandElements[2].equals("even")) {
                            printFirstNthEvenNumbers(countFirst, numbersArr);
                        } else {
                            printFirstNthOddNumbers(countFirst, numbersArr);
                        }
                    } else {
                        System.out.println("Invalid count");
                    }
                    break;
                case "last":
                    int countLast = Integer.parseInt(commandElements[1]);

                    if (countLast <= numbersArr.length) {

                        if (commandElements[2].equals("even")) {
                            printLastNthEvenNumbers(countLast, numbersArr);
                        } else {
                            printLastNthOddNumbers(countLast, numbersArr);
                        }

                    } else {
                        System.out.println("Invalid count");
                    }

                    break;
            }

            command = scanner.nextLine();
        }

        System.out.print("[");
        for (int i = 0; i < numbersArr.length; i++) {
            if (i == numbersArr.length - 1) {
                System.out.print(numbersArr[i] + "]");
            } else {
                System.out.print(numbersArr[i] + ", ");
            }
        }
    }

    public static void printEvenMaxIndex (int[] numbersArr) {
        int currentMax = Integer.MIN_VALUE;
        int index = 0;
        int counter = 0;

        for (int i = 0; i < numbersArr.length; i++) {
             if (numbersArr[i] % 2 == 0) {
                 counter++;
                 if (numbersArr[i] >= currentMax) {
                     currentMax = numbersArr[i];
                     index = i;
                 }
             }
        }
        if (counter != 0) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }

    public static void printOddMaxIndex (int[] numbersArr) {
        int currentMax = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 != 0) {
                if (numbersArr[i] >= currentMax) {
                    currentMax = numbersArr[i];
                    index = i;
                }
            }
        }
        if (currentMax != 0) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }

    public static void printEvenMinIndex (int[] numbersArr) {
        int currentMin = Integer.MAX_VALUE;
        int index = 0;
        int counter = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 == 0) {
                counter++;
                if (numbersArr[i] <= currentMin) {
                    currentMin = numbersArr[i];
                    index = i;
                }
            }
        }
        if (counter != 0) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }

    public static void printOddMinIndex (int[] numbersArr) {
        int currentMin = Integer.MAX_VALUE;
        int index = 0;
        int counter = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 != 0) {
                counter++;
                if (numbersArr[i] <= currentMin) {
                    currentMin = numbersArr[i];
                    index = i;
                }
            }
        }
        if (counter != 0) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }

    public static void printFirstNthEvenNumbers (int n, int[] numbersArr) {
        String output = "";
        int counter = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 == 0) {
                output += numbersArr[i] + " ";
                counter++;
            }
            if (counter == n) {
                break;
            }
        }

        if (counter == 0) {
            System.out.println("[]");
        } else {
            String[] toPrint = output.split(" ");
            System.out.print("[");
            for (int i = 0; i < toPrint.length; i++) {
                if (i == toPrint.length - 1) {
                    System.out.println(toPrint[i] + "]");
                } else {
                    System.out.print(toPrint[i] + ", ");
                }
            }
        }
    }

    public static void printFirstNthOddNumbers (int n, int[] numbersArr) {
        String output = "";
        int counter = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 != 0) {
                output += numbersArr[i] + " ";
                counter++;
            }
            if (counter == n) {
                break;
            }
        }

        if (counter == 0) {
            System.out.println("[]");
        } else {
            String[] toPrint = output.split(" ");
            System.out.print("[");
            for (int i = 0; i < toPrint.length; i++) {
                if (i == toPrint.length - 1) {
                    System.out.println(toPrint[i] + "]");
                } else {
                    System.out.print(toPrint[i] + ", ");
                }
            }
        }
    }

    public static void printLastNthEvenNumbers (int n, int[] numbersArr) {
        String output = "";
        int counter = 0;

        for (int i = numbersArr.length - 1; i >= 0; i--) {

            if (numbersArr[i] % 2 == 0) {
                output = numbersArr[i] + " " + output;
                counter++;
            }
            if (counter == n) {
                break;
            }
        }

        if (counter == 0) {
            System.out.println("[]");
        } else {
            String[] toPrint = output.split(" ");
            System.out.print("[");
            for (int i = 0; i < toPrint.length; i++) {
                if (i == toPrint.length - 1) {
                    System.out.println(toPrint[i] + "]");
                } else {
                    System.out.print(toPrint[i] + ", ");
                }
            }
        }
    }

    public static void printLastNthOddNumbers (int n, int[] numbersArr) {
        String output = "";
        int counter = 0;

        for (int i = numbersArr.length - 1; i >= 0; i--) {

            if (numbersArr[i] % 2 != 0) {
                output = numbersArr[i] + " " + output;
                counter++;
            }
            if (counter == n) {
                break;
            }
        }

        if (counter == 0) {
            System.out.println("[]");
        } else {
            String[] toPrint = output.split(" ");
            System.out.print("[");
            for (int i = 0; i < toPrint.length; i++) {
                if (i == toPrint.length - 1) {
                    System.out.println(toPrint[i] + "]");
                } else {
                    System.out.print(toPrint[i] + ", ");
                }
            }
        }
    }
}
