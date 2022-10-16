package Methods.Exercise;

import java.util.Scanner;

public class P09PalindromeIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String number = command;

            printIfNumberIsPalindrome(number);


            command = scanner.nextLine();
        }
    }
    public static void printIfNumberIsPalindrome (String number) {
       String reversedNumber = "";

        for (int i = 0; i < number.length(); i++) {
            reversedNumber = number.charAt(i) + reversedNumber;
        }

        if (number.equals(reversedNumber)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
