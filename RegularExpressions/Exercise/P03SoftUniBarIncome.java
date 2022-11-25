package RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();
         String regex = "%(?<name>[A-Z][a-z]+)%[^\\|\\$\\%\\.]*<(?<product>[\\w]+)>[^\\|\\$\\%\\.\\d]*\\|(?<quantity>[0-9]+)\\|[^\\|\\$\\%\\.\\d]*(?<price>[0-9]+.?[0-9]*)\\$";
         Pattern pattern = Pattern.compile(regex);

        double totalIncome = 0;

         while (!input.equals("end of shift")) {
             Matcher matcher = pattern.matcher(input);

             if (matcher.find()) {
                 String name = matcher.group("name");
                 String product = matcher.group("product");
                 int quantity = Integer.parseInt(matcher.group("quantity"));
                 double price = Double.parseDouble(matcher.group("price"));

                 System.out.printf("%s: %s - %.2f%n", name, product, price * quantity);
                 totalIncome += price * quantity;
             }
             input = scanner.nextLine();
         }

        System.out.printf("Total income: %.2f%n", totalIncome);
    }
}
