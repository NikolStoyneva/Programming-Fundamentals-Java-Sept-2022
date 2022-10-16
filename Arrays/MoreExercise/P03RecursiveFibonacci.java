package Arrays.More.Exercise;

import java.util.Scanner;

public class P03RecursiveFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] fibonacci = new int[0];

            for (int i = 0; i < n; i++) {
                int[] currentArr = new int[fibonacci.length + 1];
                for (int j = 0; j < currentArr.length; j++) {
                    if ((j == 0) || (j == 1)) {
                        currentArr[j] = 1;
                    } else {
                        currentArr[j] = fibonacci[j - 1] + fibonacci[j - 2];
                    }
                }
                fibonacci = currentArr;
            }

        System.out.println(fibonacci[fibonacci.length - 1]);
    }
}
