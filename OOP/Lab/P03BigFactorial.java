package ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class P03BigFactorial {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

       int number = Integer.parseInt(scanner.nextLine());

        BigInteger sum = new BigInteger(String.valueOf(1));

        for (int i = 2; i <= number; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }

        System.out.println(sum);
    }
}
