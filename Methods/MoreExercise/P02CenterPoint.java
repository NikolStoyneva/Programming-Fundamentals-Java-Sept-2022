package Methods.MoreExercise;

import java.util.Scanner;

public class P02CenterPoint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        printClosestPointToCenter(x1, x2, y1, y2);
    }
    public static void printClosestPointToCenter (int x1, int x2, int y1, int y2) {
        int firstSum = Math.abs(x1) + Math.abs(x2);
        int secondSum = Math.abs(y1) + Math.abs(y2);

        if (firstSum <= secondSum) {
            System.out.printf("(%d, %d)", x1, x2);
        } else {
            System.out.printf("(%d, %d)", y1, y2);
        }
    }
}
