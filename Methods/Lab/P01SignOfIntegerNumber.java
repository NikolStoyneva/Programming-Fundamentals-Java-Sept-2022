package Methods.Lab;

import java.util.Scanner;

public class P01SignOfIntegerNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printSignOfNumber(Integer.parseInt(scanner.nextLine()));

    }
    public static void printSignOfNumber (int num) {
        String sign = "";
        if (num == 0) {
            sign = "zero";
        } else if (num < 0) {
            sign = "negative";
        } else {
            sign = "positive";
        }
        System.out.printf("The number %d is %s.", num, sign);
    }
}
