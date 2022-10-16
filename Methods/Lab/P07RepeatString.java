package Methods.Lab;

import java.util.Scanner;

public class P07RepeatString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStr(input, n));

    }
    public static StringBuilder repeatStr (String strToRepeat, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            result.append(strToRepeat);
        }

        return result;
    }
}
