package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 0; rotation < rotations; rotation++) {
            int oldFirst = numbersArr[0];
            for (int i = 0; i < numbersArr.length; i++) {
                if (i == numbersArr.length - 1) {
                    numbersArr[i] = oldFirst;
                } else {
                    numbersArr[i] = numbersArr[i + 1];
                }
            }
        }

        for (int item : numbersArr) {
            System.out.print(item + " ");
        }
    }
}
