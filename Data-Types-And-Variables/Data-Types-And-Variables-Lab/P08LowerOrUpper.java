package Data.Types.And.Variables.Lab;

import java.util.Scanner;

public class P08LowerOrUpper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(letter)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }

    }
}
