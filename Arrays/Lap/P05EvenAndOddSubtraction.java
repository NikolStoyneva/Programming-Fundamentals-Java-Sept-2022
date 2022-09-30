package Arrays.Lap;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int oddSum = 0;
        int evenSum = 0;

        for (int item : numbersArr) {
            if (item % 2 == 0) {
                evenSum += item;
            } else {
                oddSum += item;
            }
        }

        int diff = evenSum - oddSum;

        System.out.println(diff);

    }
}
