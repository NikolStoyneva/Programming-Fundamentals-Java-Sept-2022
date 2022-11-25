package ObjectsAndClasses.Exercise.P02Article;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String articleDate = scanner.nextLine();

         String title = articleDate.split(", ")[0];
         String content = articleDate.split(", ")[1];
         String author = articleDate.split(", ")[2];

         Article article = new Article(title, content, author);

         int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String command = input.split(": ")[0];
            String replacement = input.split(": ")[1];

            switch (command) {
                case "Edit":
                    article.edit(replacement);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(replacement);
                    break;
                case "Rename":
                    article.rename(replacement);
                    break;
            }
        }

        System.out.println(article.toString());
    }
}
