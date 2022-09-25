package Data.Types.And.Variables.More.Exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03FloatingEquality {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOne = Double.parseDouble(scanner.nextLine());
        double numberTwo = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;

        boolean isTrue = (Math.abs(numberOne - numberTwo)) <= eps;

        if (isTrue) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
