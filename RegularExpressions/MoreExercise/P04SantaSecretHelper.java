package RegularExpressions.MoreExercise;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04SantaSecretHelper {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int key = Integer.parseInt(scanner.nextLine());
         String command = scanner.nextLine();
        Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)[^@\\-!:>]*!([G])!");
        Matcher matcher = null;

         while (!command.equals("end")) {
             String message = command;
             StringBuilder decryptedMessage = new StringBuilder();

             for (int i = 0; i < message.length(); i++) {
                 char symbol = (char) (message.charAt(i) - key);
                 decryptedMessage.append(symbol);
             }
             matcher = pattern.matcher(decryptedMessage);
             if (matcher.find()){
                 String name = matcher.group("name");
                 System.out.println(name);
             }

             command = scanner.nextLine();
         }

    }
}
