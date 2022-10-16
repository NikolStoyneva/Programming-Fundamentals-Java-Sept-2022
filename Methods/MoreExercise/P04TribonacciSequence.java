package Methods.MoreExercise;

import java.util.Scanner;

public class P04TribonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int element : getNewArr(n)) {
            System.out.print(element + " ");
        }
    }
    public static int[] getNewArr (int n) {
        int[] tribonacciArr = new int[n];

        int firstNum = 1;
        int secondNum = 0;
        int thirdNum = 0;

        for (int i = 0; i < tribonacciArr.length; i++) {
            int currentNum = firstNum + secondNum + thirdNum;
            tribonacciArr[i] = currentNum;

         firstNum = secondNum;
         secondNum = thirdNum;
         thirdNum = currentNum;

        }

        return tribonacciArr;
    }
}
