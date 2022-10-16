package Lists.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03TakeOrSkipRope {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        int lengthInputLine = inputLine.length();

        List<Integer> numbers = new ArrayList<>();
        List<String> nonNumbers = new ArrayList<>();

        for (int i = 0; i < lengthInputLine; i++) {
            char currentChar = inputLine.charAt(i);

            if (!Character.isDigit(currentChar)) {
                nonNumbers.add(String.valueOf(currentChar));
            } else if (Character.isDigit(currentChar)){
                numbers.add(Integer.parseInt(String.valueOf(currentChar)));
            }
        }

        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(numbers.get(i));
            } else {
                skipList.add(numbers.get(i));
            }
        }

        List<String> output = new ArrayList<>();

        for (int i = 0; i < takeList.size(); i++) {
            int take = takeList.get(i);
            int skip = skipList.get(i);
            int skipped = 0;
            int taken = 0;

            for (int j = 0; j < nonNumbers.size(); j++) {

                if (taken < take) {
                    output.add(nonNumbers.get(j));
                    taken++;
                    nonNumbers.remove(j);
                    j--;
                } else if (skipped < skip) {
                  nonNumbers.remove(j);
                  skipped++;
                  j--;
                }
                if (skipped == skip && taken == take) {
                    break;
                }
            }
        }

        for (String element : output) {
            System.out.print(element);
        }
    }
}
