package Data.Types.And.Variables.Lab;

import java.util.Scanner;

public class P05ConcatNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String connection = scanner.nextLine();

        System.out.printf("%s%s%s", firstName, connection, lastName);
    }
}
