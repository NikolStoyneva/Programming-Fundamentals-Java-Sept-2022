package TextProcessing.Lab;

import java.util.Scanner;

public class P03Substring {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String toRemove = scanner.nextLine();
         String input = scanner.nextLine();

         int index = input.indexOf(toRemove);

         while (index >= 0) {
             input = input.replace(toRemove, "");
             index--;
         }

        System.out.println(input);
    }
}
