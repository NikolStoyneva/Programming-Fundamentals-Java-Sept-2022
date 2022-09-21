package Basic.Syntax.Conditional.Statements.And.Loops.Exercise;

import java.util.Scanner;

public class P11RageExpenses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double total = 0;
        boolean headsetCrashed = false;
        boolean mouseCrashed = false;
        int keyboardCrashed = 0;

        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0 && i != 0) {
                total += headsetPrice;
                headsetCrashed = true;
            }
            if (i % 3 == 0 && i != 0)  {
                total += mousePrice;
                mouseCrashed = true;
            }

            if ((headsetCrashed) && (mouseCrashed)) {
                total += keyboardPrice;
                keyboardCrashed++;
            }

            if (keyboardCrashed == 2) {
                total += displayPrice;
                keyboardCrashed = 0;
            }

            headsetCrashed = false;
            mouseCrashed = false;
        }

        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
