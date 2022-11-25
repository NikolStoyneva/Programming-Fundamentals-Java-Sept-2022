package RegularExpressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class P02Race {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<String> participants = List.of(scanner.nextLine().split(", "));
        String input = scanner.nextLine();
        Map<String, Integer> participantResult = new LinkedHashMap<>();
        participants.forEach(participant -> participantResult.put(participant, 0));

        String regexLetters = "[A-Za-z]+";
        String regexDigits = "[0-9]";
        Pattern patternLetters = Pattern.compile(regexLetters);
        Pattern patternDigits = Pattern.compile(regexDigits);

        while (!input.equals("end of race")) {
            Matcher matcherLetters = patternLetters.matcher(input);
            StringBuilder participantName = new StringBuilder();

            while (matcherLetters.find()) {
                participantName.append(matcherLetters.group());
            }

            Matcher matcherDigits = patternDigits.matcher(input);
            int distance = 0;

            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }

            if (participantResult.containsKey(participantName.toString())) {
                participantResult.put(participantName.toString(), participantResult.get(participantName.toString()) + distance);
            }

            input = scanner.nextLine();
        }

        List<String> firstThreeNames = participantResult.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());


        System.out.println("1st place: " + firstThreeNames.get(0));
        System.out.println("2nd place: " + firstThreeNames.get(1));
        System.out.println("3rd place: " + firstThreeNames.get(2));
    }
}
