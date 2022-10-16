package Methods.Exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08FactorialDivision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        double result = getFactorialNumber(number1) * 1.0 / getFactorialNumber(number2);

        System.out.printf("%.2f", result);
    }
    public static long getFactorialNumber (int number1) {
        long result = 1;

        for (int i = 1; i <= number1; i++) {
            result *= i;
        }
        return result;
    }
}
