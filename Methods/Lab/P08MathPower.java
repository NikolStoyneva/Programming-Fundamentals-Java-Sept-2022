package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        double result = getMathPower(number,power);

        DecimalFormat df = new DecimalFormat("0.#####");

        System.out.println(df.format(result));
    }
    public static double getMathPower (double number, double power) {
       double result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }
       return result;
    }
}
