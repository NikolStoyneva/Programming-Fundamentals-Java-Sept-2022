package Methods.MoreExercise;

import java.util.Scanner;

public class P03LongerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x3 = Double.parseDouble(scanner.nextLine());
        double y3 = Double.parseDouble(scanner.nextLine());
        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());

        printLongerLine(x1, y1, x2, y2, x3, y3, x4, y4);

    }
    public static void printLongerLine (double x1, double y1, double x2, double y2, double x3,
                                        double y3, double x4, double y4) {

        double firstLength = Math.abs(x2 - x1) + Math.abs(y2 - y1);
        double secondLength = Math.abs(x4 - x3) + Math.abs(y4 - y3);;


        if (firstLength >= secondLength) {
            double sumX = Math.abs(x1) + Math.abs(y1);
            double sumY = Math.abs(x2) + Math.abs(y2);
            if (sumX < sumY) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1, y1, x2, y2);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x2, y2, x1, y1);
            }
        } else {
            double sumX = Math.abs(x3) + Math.abs(y3);
            double sumY = Math.abs(x4) + Math.abs(y4);
            if (sumX < sumY) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x3, y3, x4, y4);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x4, y4, x3, y3);
            }
        }

    }
}
