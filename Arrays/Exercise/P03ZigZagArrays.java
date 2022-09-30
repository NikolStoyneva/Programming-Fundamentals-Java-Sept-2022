package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scanner.next());
            int num2 = Integer.parseInt(scanner.next());

            if (i % 2 == 0) {
                firstArr[i] = num1;
                secondArr[i] = num2;
            } else {
                firstArr[i] = num2;
                secondArr[i] = num1;
            }
        }

        for (int item : firstArr) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (int item : secondArr) {
            System.out.print(item + " ");
        }

    }
}
