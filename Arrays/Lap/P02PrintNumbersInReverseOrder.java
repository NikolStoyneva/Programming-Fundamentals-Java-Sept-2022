package Arrays.Lap;

import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbersArr = new int[n];

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            numbersArr[i] = currentNum;
        }

        for (int m = numbersArr.length - 1; m >= 0; m--) {
            System.out.printf("%d ", numbersArr[m]);
        }

    }
}
