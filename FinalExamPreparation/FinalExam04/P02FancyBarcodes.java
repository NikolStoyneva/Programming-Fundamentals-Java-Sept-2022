package FinalExam.ProgrammingFundamentals.FinalExam04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("[\\\\@][\\\\#]+(?<item>[A-Z]{1}[a-zA-Z0-9]{4,}[A-Z]{1})[\\\\@][\\\\#]+");

        for (int j = 0; j < n; j++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String product = matcher.group("item");
                String group = "";

                for (int i = 0; i < product.length(); i++) {
                    if (Character.isDigit(product.charAt(i))) {
                        group += product.charAt(i);
                    }
                }
                if (group.isEmpty()) {
                    group = "00";
                }
                System.out.printf("Product group: %s%n", group);
            } else {
                System.out.println("Invalid barcode");
            }

        }

    }
}
