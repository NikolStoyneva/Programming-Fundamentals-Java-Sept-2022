package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int longestOne = 0;
        int currentOne = 0;
        String maxSequence = "";
        String currentSequence = "";
        int old = numbersArr[0];

        for (int i = 0; i < numbersArr.length; i++) {

            if (i == 0) {
                currentSequence += numbersArr[i] + " ";
                currentOne++;
            } else {
                if (numbersArr[i] == old) {
                    currentSequence += numbersArr[i] + " ";
                    old = numbersArr[i];
                   currentOne++;
                } else {
                      currentSequence = "";
                      currentSequence += numbersArr[i] + " ";
                      currentOne = 1;
                      old = numbersArr[i];
                }
            }
            if  (currentOne > longestOne) {
                longestOne = currentOne;
                maxSequence = currentSequence;
            }

        }

        System.out.println(maxSequence);
    }
}
