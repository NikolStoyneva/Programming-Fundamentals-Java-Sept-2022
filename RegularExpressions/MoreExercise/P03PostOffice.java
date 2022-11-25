package RegularExpressions.MoreExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03PostOffice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputLine = scanner.nextLine().split("\\|");
        String firstText = inputLine[0];
        String secondText = inputLine[1];
        String thirdText = inputLine[2];
        Pattern capitalLetters = Pattern.compile("([\\$\\#\\%\\*\\&])(?<capitalLetters>[A-Z]+)\\1");
        Matcher matcherLetters = capitalLetters.matcher(firstText);
        Pattern length = Pattern.compile("(?<asciiCode>[0-9]{2}):(?<length>[\\d]{2})");
        Matcher matcherLength = length.matcher(secondText);

        LinkedHashMap<Character, Integer> wordMap = new LinkedHashMap<>();

        while (matcherLetters.find()) {
            String group = matcherLetters.group("capitalLetters");
            for (int i = 0; i < group.length(); i++) {
                wordMap.put((group.charAt(i)), 1);
            }
        }
        while (matcherLength.find()) {
            int asciiCode = Integer.parseInt(matcherLength.group("asciiCode"));
            char letter = (char) asciiCode;
            int length1 = Integer.parseInt(matcherLength.group("length"));

            if (asciiCode >= 65 && asciiCode <= 90) {
                if (wordMap.containsKey(letter)) {
                    if (wordMap.get(letter) == 1) {
                        wordMap.put(letter, wordMap.get(letter) + length1);
                    } else if (wordMap.get(letter) - 1 < length1){
                        wordMap.put(letter, wordMap.get(letter) + length1);
                    }
                }
            }
        }

        String[] thirdTextWords = thirdText.split(" ");
        List<String> wordsList = new ArrayList<>(Arrays.asList(thirdTextWords));

        List<String> finalWords = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
            char currentLetter = entry.getKey();
            int symbols = entry.getValue();

            for (int i = 0; i < wordsList.size(); i++) {
                if (wordsList.get(i).charAt(0) == currentLetter && wordsList.get(i).length() == symbols) {
                    finalWords.add(wordsList.get(i));
                    wordsList.remove(wordsList.get(i));
                    break;
                }
            }
        }

        for (int i = 0; i < finalWords.size(); i++) {
            System.out.println(finalWords.get(i));
        }
    }
}
