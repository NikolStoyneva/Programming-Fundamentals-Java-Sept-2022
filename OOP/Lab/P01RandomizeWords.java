package ObjectsAndClasses.Lab;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<String> wordsList = new java.util.ArrayList<>(List.of(scanner.nextLine().split(" ")));

        Random randomGenerator = new Random();

        for (int i = 0; i < wordsList.size(); i++) {
            int index = randomGenerator.nextInt(wordsList.size());

            System.out.println(wordsList.get(index));

            wordsList.remove(index);
            i--;
        }
    }
}
