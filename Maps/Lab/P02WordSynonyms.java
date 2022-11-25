package AssociativeArrays.Lab;

import java.util.*;

public class P02WordSynonyms {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> synonymMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String currentWord = scanner.nextLine();
            String currentSynonym = scanner.nextLine();

            synonymMap.putIfAbsent(currentWord, new ArrayList<>());

            synonymMap.get(currentWord).add(currentSynonym);
        }

        for (Map.Entry<String, ArrayList<String>> entry : synonymMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }


    }
}
