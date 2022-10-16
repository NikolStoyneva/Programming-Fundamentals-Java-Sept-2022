package Lists.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CarRace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        double leftCarTime = 0;
        double rightCarTime = 0;

        int finishIndex = numbers.size() / 2;

        for (int i = 0; i < finishIndex; i++) {
            if (numbers.get(i) != 0) {
                leftCarTime += numbers.get(i);
            } else {
                leftCarTime *= 0.8;
            }
        }

        for (int i = numbers.size() - 1; i > finishIndex; i--) {
            if (numbers.get(i) != 0) {
                rightCarTime += numbers.get(i);
            } else {
                rightCarTime *= 0.8;
            }
        }

       if (leftCarTime < rightCarTime) {
           System.out.printf("The winner is left with total time: %.1f", leftCarTime);
       } else {
           System.out.printf("The winner is right with total time: %.1f", rightCarTime);
       }
    }
}
