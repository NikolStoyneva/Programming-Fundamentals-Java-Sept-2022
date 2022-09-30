package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] numbersArr = Arrays
               .stream(scanner.nextLine().split(" "))
               .mapToInt(Integer::parseInt)
               .toArray();

        for (int i = 0; i < numbersArr.length; i++) {
            boolean isBigger = true;
            for (int j = i + 1; j < numbersArr.length; j++) {
                if (numbersArr[i] <= numbersArr[j]) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(numbersArr[i] + " ");
            }
        }
    }
}
