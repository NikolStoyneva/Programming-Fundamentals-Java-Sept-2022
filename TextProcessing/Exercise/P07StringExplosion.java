package TextProcessing.Exercise;

import java.util.Scanner;

public class P07StringExplosion {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         StringBuilder textBuilder = new StringBuilder(scanner.nextLine());

         int totalPower = 0;

        for (int i = 0; i < textBuilder.length(); i++) {

            if (textBuilder.charAt(i) == '>') {
               totalPower += Integer.parseInt(textBuilder.charAt(i + 1) + "");
            } else if (totalPower > 0){
                textBuilder.deleteCharAt(i);
                totalPower--;
                i--;
            }
        }

        System.out.println(textBuilder);
    }
}
