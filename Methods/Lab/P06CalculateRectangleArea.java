package Methods.Lab;

import java.util.Scanner;

public class P06CalculateRectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int area = getArea(width, length);

        System.out.println(area);
    }
    public static int getArea (int width, int length) {
        return width * length;
    }
}
