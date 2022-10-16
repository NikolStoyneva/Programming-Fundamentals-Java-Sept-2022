package Methods.Exercise;

import java.util.Scanner;

public class P07NxNMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

       printMatrix(n);

    }

    public static void printMatrix (int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
