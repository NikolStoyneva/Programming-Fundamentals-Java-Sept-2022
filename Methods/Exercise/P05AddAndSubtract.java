package Methods.Exercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int sum = getSumResult(number1, number2);

        System.out.println(getSubtractResult(sum, number3));

    }
    public static int getSumResult (int number1, int number2) {
        return number1 + number2;
    }
    public static int getSubtractResult (int sum, int number3) {
        return sum - number3;
    }
}
