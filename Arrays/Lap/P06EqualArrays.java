package Arrays.Lap;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner (System.in);

        int[] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isEqual = true;
        int sum = 0;
        for (int i = 0; i < firstArr.length; i++) {
            int firstNum = firstArr[i];
            int secondNum = secondArr[i];

            if (firstNum == secondNum) {
                sum += firstNum;
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isEqual = false;
                break;
            }
        }
        if (isEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
