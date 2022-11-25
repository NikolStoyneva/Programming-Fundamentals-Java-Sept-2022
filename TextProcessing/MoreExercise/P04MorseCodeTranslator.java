package TextProcessing.MoreExercise;

import java.util.Scanner;

public class P04MorseCodeTranslator {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String[] input = scanner.nextLine().split(" ");
         StringBuilder translatedMessage = new StringBuilder();

         for (String word : input) {
             translatedMessage.append(translateLetter(word));
         }

        System.out.println(translatedMessage);
    }
    public static String translateLetter (String word) {
        if (word.equals(".-")) {
            return ("A");
        }
        if (word.equals("-...")) {
            return ("B");
        }
        if (word.equals("-.-.")) {
            return ("C");
        }
        if (word.equals("-..")) {
            return ("D");
        }
        if (word.equals(".")) {
            return ("E");
        }
        if (word.equals("..-.")) {
            return ("F");
        }
        if (word.equals("--.")) {
            return ("G");
        }
        if (word.equals("....")) {
            return ("H");
        }
        if (word.equals("..")) {
            return ("I");
        }
        if (word.equals(".---")) {
            return ("J");
        }
        if (word.equals("-.-")) {
            return ("K");
        }
        if (word.equals(".-..")) {
            return ("L");
        }
        if (word.equals("--")) {
            return ("M");
        }
        if (word.equals("-.")) {
            return ("N");
        }
        if (word.equals("---")) {
            return ("O");
        }
        if (word.equals(".--.")) {
            return ("P");
        }
        if (word.equals("--.-")) {
            return ("Q");
        }
        if (word.equals(".-.")) {
            return ("R");
        }
        if (word.equals("...")) {
            return ("S");
        }
        if (word.equals("-")) {
            return ("T");
        }
        if (word.equals("..-")) {
            return ("U");
        }
        if (word.equals("...-")) {
            return ("V");
        }
        if (word.equals(".--")) {
            return ("W");
        }
        if (word.equals("-..-")) {
            return ("X");
        }
        if (word.equals("-.--")) {
            return ("Y");
        }
        if (word.equals("--..")) {
            return ("Z");
        }
        if (word.equals("|")) {
            return (" ");
        }
        return "";
    }
}
