package Arrays.More.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] namesArr = new String[n];

        int[] codeArr = new int[n];

        for (int i = 0; i < n; i++) {
            namesArr[i] = scanner.nextLine();
            int length = namesArr[i].length();

            for (int j = 0; j < length; j++) {
                char currentChar = namesArr[i].charAt(j);
                if ((namesArr[i].charAt(j) == 'a') || (namesArr[i].charAt(j) == 'e') || (namesArr[i].charAt(j) == 'i')
                || (namesArr[i].charAt(j) == 'o') || (namesArr[i].charAt(j) == 'u') || (namesArr[i].charAt(j) == 'A') || (namesArr[i].charAt(j) == 'E') || (namesArr[i].charAt(j) == 'I')
                        || (namesArr[i].charAt(j) == 'O') || (namesArr[i].charAt(j) == 'U')) {
                    int letterCode = (int) namesArr[i].charAt(j);
                    codeArr[i] += letterCode * length;
                } else {
                    int letterCode = (int) namesArr[i].charAt(j) / length;
                    codeArr[i] += letterCode;
                }
            }
        }

        Arrays.sort(codeArr);


        for (int item : codeArr) {
            System.out.println(item);
        }
    }
}
