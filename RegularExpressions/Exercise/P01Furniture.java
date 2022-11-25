package RegularExpressions.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();

        List<String> furnitureList = new ArrayList<>();
        double totalMoney = 0;
        String regex = "%(?<name>[A-Z][a-z]+)%<(?<product>[A-Za-z]+)>\\|(?<quantity>[0-9]+)\\|(?<price>[0-9]+.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);
         while (!input.equals("Purchase")) {
             Matcher matcher = pattern.matcher(input);

             if (matcher.find()) {
                 String furniture = matcher.group("furniture");
                 double price = Double.parseDouble(matcher.group("price"));
                 int quantity = Integer.parseInt(matcher.group("quantity"));
                 furnitureList.add(furniture);
                 totalMoney += quantity * price;
             }

            input = scanner.nextLine();
         }

        System.out.println("Bought furniture:");
        for (int i = 0; i < furnitureList.size(); i++) {
            System.out.printf("%s%n", furnitureList.get(i));
        }
        System.out.printf("Total money spend: %.2f", totalMoney);
    }
}
