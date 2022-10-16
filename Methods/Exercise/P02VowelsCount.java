package Methods.Exercise;

import java.util.Scanner;

public class P02VowelsCount {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner (System.in);

        String input = scanner.nextLine();

        printVowelsCount(input.toLowerCase());

    }
    public static void printVowelsCount (String input) {
        int count = 0;

        for (char symbol : input.toCharArray()) {
            if (symbol == 'a' || symbol == 'i' || symbol == 'e' || symbol == 'o' ||
            symbol == 'u') {
                count++;
            }
        }

        System.out.println(count);
    }
}
