package RegularExpressions.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01MatchFullName {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String text = scanner.nextLine();
         String[] names = text.split(", ");

         String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(text);

         while (matcher.find()) {
             System.out.print(matcher.group() + " ");
         }
    }
}
