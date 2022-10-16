package Arrays.More.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04LongestIncreasingSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] seq = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] len = new int[seq.length];


    }
}
