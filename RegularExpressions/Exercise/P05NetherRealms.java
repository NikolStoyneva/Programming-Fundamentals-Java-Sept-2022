package RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05NetherRealms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputAr = scanner.nextLine().split(",");
        String healthRegex = "[^\\/0-9\\+\\-\\.\\*]";
        String damageRegex = "[-]?[0-9]+[.]?[0-9]*";
        String regexSign = "[\\/\\*]";

        for (String element : inputAr) {
            String input = element.trim();

            int healthTotal = 0;
            Pattern patternHealth = Pattern.compile(healthRegex);
            Matcher matcherHealth = patternHealth.matcher(input);
            while (matcherHealth.find()) {
                healthTotal += (int) matcherHealth.group().charAt(0);
            }

            double damageTotal = 0;
            Pattern patternDamage = Pattern.compile(damageRegex);
            Matcher matcherDamage = patternDamage.matcher(input);

            while (matcherDamage.find()) {

                double currentNum = Double.parseDouble(matcherDamage.group());
                damageTotal += (currentNum);
            }

            Pattern pattern = Pattern.compile(regexSign);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                char sign = matcher.group().charAt(0);
                if (sign == '*') {
                    damageTotal *= 2;
                } else {
                    damageTotal /= 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", input, healthTotal, damageTotal);

        }

    }
}
