package TextProcessing.Exercise;

import java.util.Scanner;

public class P01ValidUsernames {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String[] usernamesArr = scanner.nextLine().split(", ");

         for (String username : usernamesArr) {
             if (isValidUsername(username)) {
                 System.out.println(username);
             }
         }



    }
    public static boolean isValidUsername (String username) {

        boolean isValid = true;

        if (username.length() < 3 || username.length() > 16) {
            isValid = false;
        }

        for (int i = 0; i < username.length(); i++) {
            char currentChar = username.charAt(i);

            if ((!Character.isLetter(currentChar)) && (!Character.isDigit(currentChar)) && (currentChar != '-') && currentChar != '_') {
                isValid = false;
            }
        }
        return isValid;
    }
}
