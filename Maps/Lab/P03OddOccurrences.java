package AssociativeArrays.Lab;

import java.util.*;

public class P03OddOccurrences {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String[] inputArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();

        for (int i = 0; i < inputArr.length; i++) {
            String currentWord = inputArr[i].toLowerCase();

            wordsMap.putIfAbsent(currentWord, 0);

            wordsMap.put(currentWord, wordsMap.get(currentWord) + 1);
        }

        List<String> resultList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", resultList));
    }
}
