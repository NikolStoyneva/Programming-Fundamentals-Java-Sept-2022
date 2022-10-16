package Arrays.More.Exercise;

import java.util.Scanner;

public class P02PascalTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[] pascalArr = new int[0];

        for (int i = 0; i < rows; i++) {
            int[] currentArr = new int[pascalArr.length + 1];

            for (int j = 0; j < currentArr.length; j++) {
                if (j == 0 || j == currentArr.length - 1) {
                    currentArr[j] = 1;
                } else {
                    currentArr[j] = pascalArr[j] + pascalArr[j - 1];
                }
            }
            pascalArr = currentArr;

            for (int element : pascalArr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
