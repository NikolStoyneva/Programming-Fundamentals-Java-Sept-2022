package Lists.MoreExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Messaging {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        StringBuilder input = new StringBuilder(scanner.nextLine());

        String result = "";

        for (int i = 0; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            int currentSum = 0;

            while (currentNum > 0) {
                currentSum += currentNum % 10;

                currentNum /= 10;
            }

            int stringLength = input.length();
            int index = 0;

            while (currentSum > stringLength) {
                currentSum -= stringLength;
            }

            for (int j = 0; j < stringLength; j++) {
                char currentChar = input.charAt(index);
                if (index == currentSum) {
                    result += currentChar;
                    input.deleteCharAt(i);
                    break;
                }
                    index++;
            }

        }

        System.out.println(result);
    }
}
