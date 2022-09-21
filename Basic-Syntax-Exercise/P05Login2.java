package Basic.Syntax.Conditional.Statements.And.Loops.Exercise;

import java.util.Scanner;

public class P05Login2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = new StringBuilder(username).reverse().toString();

        String inputPass = scanner.nextLine();

        int counter = 0;
        boolean isBlocked = false;

        while (!inputPass.equals(password)) {
            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                isBlocked = true;
                break;
            }
            System.out.println("Incorrect password. Try again.");
            inputPass = scanner.nextLine();
        }

        if (!isBlocked) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
