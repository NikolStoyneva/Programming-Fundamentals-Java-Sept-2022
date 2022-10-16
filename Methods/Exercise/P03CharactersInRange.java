package Methods.Exercise;

import java.util.Scanner;

public class P03CharactersInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startInterval = scanner.nextLine().charAt(0);
        char endInterval = scanner.nextLine().charAt(0);

        printCharactersInRange(startInterval, endInterval);

    }
    public static void printCharactersInRange (char startInterval, char endInterval) {

        if (startInterval > endInterval) {
            char oldStart = startInterval;
            startInterval = endInterval;
            endInterval = oldStart;
        }
        for (int i = startInterval + 1; i < endInterval; i++) {
            System.out.printf("%c ", (char) i);
        }
    }
}
