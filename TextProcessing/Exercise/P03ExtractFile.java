package TextProcessing.Exercise;

import java.util.Scanner;

public class P03ExtractFile {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String filePath = scanner.nextLine();
         int startIndex = filePath.lastIndexOf('\\');
         int endIndex = filePath.indexOf('.');

         String name = filePath.substring(startIndex + 1, endIndex);
         String extension = filePath.substring(endIndex + 1);

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);

    }
}
