package RegularExpressions.MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01WinningTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputLine = scanner.nextLine().split("[, ]+");
        Pattern pattern = Pattern.compile("[\\\\$]{6,}|[\\\\@]{6,}|[\\\\#]{6,}|[\\\\^]{6,}");
        Matcher matcherLeft = null;
        Matcher matcherRight = null;

        for (int i = 0; i < inputLine.length; i++) {
            String ticket = inputLine[i];

            if (isValid(ticket)) {
                String ticketLeftSide = ticket.substring(0, 10);
                String ticketRightSide = ticket.substring(10);

                matcherLeft = pattern.matcher(ticketLeftSide);
                matcherRight = pattern.matcher(ticketRightSide);

                if (matcherRight.find() && matcherLeft.find()) {
                    int leftLength = matcherLeft.group().length();
                    int rightLength = matcherRight.group().length();
                    char symbolLeft = matcherLeft.group().charAt(0);

                    if (leftLength == 10 && rightLength == 10) {
                        System.out.printf("ticket \"%s\" - %d%c Jackpot!%n", ticket, leftLength, symbolLeft);
                    } else {
                        System.out.printf("ticket \"%s\" - %d%c%n", ticket, Math.min(leftLength, rightLength), symbolLeft);
                    }
                } else {
                    System.out.printf("ticket \"%s\" - no match%n", ticket);
                }
            } else {
                System.out.println("invalid ticket");
            }
        }
    }
    public static boolean isValid (String ticket) {
        return (ticket.length() == 20);
    }
}
