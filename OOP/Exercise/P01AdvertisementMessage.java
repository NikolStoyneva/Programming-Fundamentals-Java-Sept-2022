package ObjectsAndClasses.Exercise;

import java.util.Random;
import java.util.Scanner;

public class P01AdvertisementMessage {

    static class Message {
        private String[] phrase;
        private String[] event;
        private String[] author;
        private String[] city;


        public Message(String[] phrase, String[] event, String[] author, String[] city) {
            this.phrase = phrase;
            this.event = event;
            this.author = author;
            this.city = city;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Random rnd = new Random();

        String[] phrase = new String[] {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] event = new String[] {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author = new String[] {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] city = new String[] {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};


        for (int i = 0; i < n; i++) {
            int indexPhrases = rnd.nextInt(phrase.length);
            int indexEvent = rnd.nextInt(event.length);
            int indexAuthor = rnd.nextInt(author.length);
            int indexCity = rnd.nextInt(city.length);

            System.out.printf("%s %s %s - %s%n", phrase[indexPhrases], event[indexEvent], author[indexAuthor], city[indexCity]);
        }
    }
}
