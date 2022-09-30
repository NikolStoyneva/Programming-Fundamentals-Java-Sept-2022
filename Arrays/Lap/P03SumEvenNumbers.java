package Arrays.Lap;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();

        int[] numbersArr = Arrays.stream(numbers
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;

        for (int i = 0; i < numbersArr.length; i++) {
           if (numbersArr[i] % 2 == 0) {
               evenSum += numbersArr[i];
           }
        }
        System.out.println(evenSum);
    }
}
