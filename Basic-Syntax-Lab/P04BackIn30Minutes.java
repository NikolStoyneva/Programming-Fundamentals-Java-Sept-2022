package Basic.Syntax.Conditional.Statements.And.Loops.Lab;

import java.util.Scanner;

public class P04BackIn30Minutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 30;

        if (minutes >= 60) {
            hour++;
            minutes -= 60;
        }

        if (hour == 24) {
            hour = 0;
        }

        System.out.printf("%d:%02d", hour, minutes);
    }
}
