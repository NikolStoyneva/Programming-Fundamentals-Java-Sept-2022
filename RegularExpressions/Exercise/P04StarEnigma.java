package RegularExpressions.Exercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());
         String regexStar = "[starSTAR]";
         Pattern patternStar = Pattern.compile(regexStar);
         String regex = "[^\\@\\-\\!\\:\\>]*@(?<name>[A-Za-z]+)[^\\@\\-\\!\\:\\>]*\\:(?<population>[0-9]+)\\!(?<attack>[AD])![^\\@\\-\\!\\:\\>]*->(?<soldier>[0-9]+)[^\\@\\-\\!\\:\\>]*";

        List<String> destroyedPlanets = new ArrayList<>();
        List<String> attackedPlanets = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            StringBuilder updatedInput = new StringBuilder();
            Matcher matcherStar = patternStar.matcher(input);
            int counter = 0;

            while (matcherStar.find()) {
                counter++;
            }

            for (int j = 0; j < input.length(); j++) {
                char updatedChar = (char) (input.charAt(j) - counter);
                updatedInput.append(updatedChar);
            }

            input = updatedInput.toString();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String planetName = matcher.group("name");
                String attackType = matcher.group("attack");

                if (attackType.equals("A")) {
                    attackedPlanets.add(planetName);
                } else {
                    destroyedPlanets.add(planetName);
                }
            }
        }

        Collections.sort(destroyedPlanets);
        Collections.sort(attackedPlanets);

        System.out.println("Attacked planets: " + attackedPlanets.size());
        for (int i = 0; i < attackedPlanets.size(); i++) {
            System.out.println("-> " + attackedPlanets.get(i));
        }
        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        for (int i = 0; i < destroyedPlanets.size(); i++) {
            System.out.println("-> " + destroyedPlanets.get(i));
        }
    }
}
