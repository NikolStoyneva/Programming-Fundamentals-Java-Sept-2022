package TextProcessing.MoreExercise;

import java.util.Scanner;

public class P05HTML {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String titleOfArticle = scanner.nextLine();
         String content = scanner.nextLine();
         String command = scanner.nextLine();

        System.out.println(formatTitle(titleOfArticle));
        System.out.println(formatContent(content));

         while (!command.equals("end of comments")) {
             String currentComment = command;

             System.out.println(formatComment(currentComment));

             command = scanner.nextLine();
         }

    }
    public static String formatTitle (String title) {
        return String.format("<h1>%n" +
                "%s%n" +
                "</h1>", title);
    }
    public static String formatContent (String content) {
        return String.format("<article>%n" +
                "%s%n" +
                "</article>", content);
    }
    public static String formatComment (String comment) {
        return String.format("<div>%n" +
                "%s%n" +
                "</div>", comment);
    }
}
