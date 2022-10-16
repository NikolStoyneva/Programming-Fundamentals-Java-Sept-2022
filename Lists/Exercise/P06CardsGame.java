package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (firstPlayerCards.size() > 0 && secondPlayerCards.size() > 0) {

            int firstPlayerCard = firstPlayerCards.get(0);
            int secondPlayerCard = secondPlayerCards.get(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
                secondPlayerCards.remove(0);
                firstPlayerCards.remove(0);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerCards.add(secondPlayerCard);
                secondPlayerCards.add(firstPlayerCard);
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);
            } else {
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);
            }
        }

        if (firstPlayerCards.size() > 0) {

            int sumOne = 0;
            for (int element : firstPlayerCards) {
                sumOne += element;
            }
            System.out.printf("First player wins! Sum: %d", sumOne);

        } else {

            int sumTwo = 0;
            for (int element : secondPlayerCards) {
                sumTwo += element;
            }
            System.out.printf("Second player wins! Sum: %d", sumTwo);
        }
    }
}
