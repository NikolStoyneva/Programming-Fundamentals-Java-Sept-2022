package FinalExam.ProgrammingFundamentals.FinalExam04;

import java.util.Scanner;

public class P01PasswordReset {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String[] commandElements = command.split(" ");

            if (command.contains("TakeOdd")) {

                password = getOdd(password);
                System.out.println(password);
            } else if (command.contains("Cut")) {
                int index = Integer.parseInt(commandElements[1]);
                int length = Integer.parseInt(commandElements[2]);

                String substringToRemove = password.substring(index, index + length);
                password = password.replaceFirst(substringToRemove, "");
                System.out.println(password);
            } else if (command.contains("Substitute")) {
                String substring = commandElements[1];
                String substitute = commandElements[2];

                if (password.contains(substring)) {
                    while (password.contains(substring)) {
                        password = password.replaceFirst(substring, substitute);
                    }
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }
            command = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", password);
    }
    public static String getOdd (String password) {
        StringBuilder updatedPass = new StringBuilder();
        for (int i = 1; i < password.length(); i+=2) {
            updatedPass.append(password.charAt(i));
        }
        return updatedPass.toString();
    }
}
