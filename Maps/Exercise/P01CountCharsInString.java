package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInString {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();

        LinkedHashMap<Character, Integer> lettersMap = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar != ' ') {
                lettersMap.putIfAbsent(currentChar, 0);
                lettersMap.put(currentChar, lettersMap.get(currentChar) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : lettersMap.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
