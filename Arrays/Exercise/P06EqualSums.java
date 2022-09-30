package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isEqual = false;
        if (numbersArr.length == 1) {
            System.out.println("0");
        } else {
            for (int i = 0; i < numbersArr.length; i++) {
                int leftSum = 0;
                int rightSum = 0;
                for (int j = 0; j < numbersArr.length; j++) {
                    if (j < i) {
                        leftSum += numbersArr[j];
                    } else if (j > i) {
                        rightSum += numbersArr[j];
                    }
                }
                if (rightSum == leftSum) {
                    System.out.println(i);
                    isEqual = true;
                    break;
                }
            }
            if (!isEqual) {
                System.out.println("no");
            }
        }
    }
}
