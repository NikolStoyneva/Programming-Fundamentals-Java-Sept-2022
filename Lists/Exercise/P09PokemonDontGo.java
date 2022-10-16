package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner (System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumRemovedElements = 0;

        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index < numbers.size()) {
                int element = numbers.get(index);

                sumRemovedElements += element;
                numbers.remove(index);

                for (int i = 0; i < numbers.size(); i++) {
                    int currentNum = numbers.get(i);

                    if (currentNum <= element) {
                        numbers.set(i, currentNum + element);
                    } else {
                        numbers.set(i, currentNum - element);
                    }
                }

            } else if (index < 0) {
                int firstElement = numbers.get(0);

                sumRemovedElements += firstElement;
                numbers.remove(0);
                numbers.add(0, numbers.get(numbers.size() - 1));

                for (int i = 0; i < numbers.size(); i++) {
                    int currentNum = numbers.get(i);

                    if (currentNum <= firstElement) {
                        numbers.set(i, currentNum + firstElement);
                    } else {
                        numbers.set(i, currentNum - firstElement);
                    }
                }


            } else {
                int lastElement = numbers.get(numbers.size() - 1);

                sumRemovedElements += lastElement;
                numbers.remove(numbers.size() - 1);
                numbers.add(numbers.get(0));

                for (int i = 0; i < numbers.size(); i++) {
                    int currentNum = numbers.get(i);

                    if (currentNum <= lastElement) {
                        numbers.set(i, currentNum + lastElement);
                    } else {
                        numbers.set(i, currentNum - lastElement);
                    }
                }

            }

        }


        System.out.println(sumRemovedElements);
    }
}
