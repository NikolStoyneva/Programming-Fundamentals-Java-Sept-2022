package Methods.Exercise;

import java.util.Scanner;

public class P04PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPassword = scanner.nextLine();

        if (isItConsistTwoDigits(inputPassword) && itConsistOnlyLettersAndDigits(inputPassword)
        && isItRightLength(inputPassword)) {
            System.out.println("Password is valid");
        }
        if (!isItRightLength(inputPassword)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!itConsistOnlyLettersAndDigits(inputPassword)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!isItConsistTwoDigits(inputPassword)) {
            System.out.println("Password must have at least 2 digits");
        }

    }
    public static boolean isItRightLength (String password) {
        int length = password.length();

        return (length >= 6 && length <= 10);
    }

    public static boolean itConsistOnlyLettersAndDigits (String password) {
        boolean isValid = true;

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                isValid = false;
            }
        }
        return isValid;
    }
    
    public static boolean isItConsistTwoDigits (String password) {
        int counter = 0;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                counter++;
            }
            if (counter >= 2) {
                break;
            }
        }
        return counter >= 2;
    }
}
