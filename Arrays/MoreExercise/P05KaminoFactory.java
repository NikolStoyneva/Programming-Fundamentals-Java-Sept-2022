package Arrays.More.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05KaminoFactory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int bestLength = Integer.MIN_VALUE;
        int bestSum = 0;
        int bestIndex = 0;
        int bestLine = 0;
        int[] bestSequence = new int[0];

        int lines = 0;

        while (!command.equals("Clone them!")) {
            lines++;
            int[] dnaArr = Arrays
                    .stream(command.split("!+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int length = 0;
            int currentMaxLength = 0;
            int sum = 0;
            int index = 0;

            for (int i = 0; i < dnaArr.length; i++) {
                if (dnaArr[i] == 1) {
                    sum += dnaArr[i];
                    length++;
                }

                if (length > currentMaxLength) {
                    currentMaxLength = length;
                }

                if (dnaArr[i] == 0) {
                    length = 0;
                }
            }

            int indexChecker = 0;
            for (int i = 0; i < dnaArr.length; i++) {
                if (dnaArr[i] == 1) {
                    indexChecker++;
                } else {
                    indexChecker = 0;
                }
                if (indexChecker == 2) {
                    index = i - 1;
                    break;
                }

            }
            if (currentMaxLength > bestLength) {
                bestLength = currentMaxLength;
                bestSum = sum;
                bestLine = lines;
                bestIndex = index;
                bestSequence = dnaArr;
            } else if (currentMaxLength == bestLength) {
                if (index < bestIndex) {
                    bestSum = sum;
                    bestLine = lines;
                    bestIndex = index;
                    bestSequence = dnaArr;
                } else if (sum > bestSum) {
                    bestSum = sum;
                    bestLine = lines;
                    bestIndex = index;
                    bestSequence = dnaArr;
                }
            }
            command = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestLine, bestSum);
        for (int element :  bestSequence) {
            System.out.print(element + " ");
        }

    }
}
