package Lists.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P04MixedUpLists {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int minLength = Math.min(firstList.size(), secondList.size());

        int index = minLength - 1;

        if (secondList.size() > firstList.size()) {
            Collections.reverse(secondList);

            for (int i = 0; i < minLength; i++) {

                resultList.add(firstList.get(i));
                resultList.add(secondList.get(i));

            }
        } else {

            for (int i = 0; i < minLength; i++) {

                resultList.add(firstList.get(i));
                resultList.add(secondList.get(index));

                index--;
            }
        }
        List<Integer> lastTwoNumbers = new ArrayList<>();

        if (firstList.size() > secondList.size()) {
            lastTwoNumbers.addAll(firstList.subList(minLength, firstList.size()));
        } else {
            lastTwoNumbers.addAll(secondList.subList(minLength, secondList.size()));
        }

        int minNum = Math.min(lastTwoNumbers.get(0), lastTwoNumbers.get(1));
        int maxNum = Math.max(lastTwoNumbers.get(0), lastTwoNumbers.get(1));

        List<Integer> outputNumbers = new ArrayList<>();

        for (int i = 0; i < resultList.size(); i++) {
            int currentNum = resultList.get(i);

            if (currentNum > minNum && currentNum < maxNum) {
                outputNumbers.add(currentNum);
            }
        }

        Collections.sort(outputNumbers);

        System.out.println(outputNumbers.toString().replaceAll("[\\[\\],]", ""));

    }
}
