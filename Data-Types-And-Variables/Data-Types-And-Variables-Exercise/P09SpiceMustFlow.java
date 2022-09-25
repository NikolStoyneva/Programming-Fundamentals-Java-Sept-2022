package Data.Types.And.Variables.Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int workingDays = 0;
        int total = 0;

        while (true) {

            if (startingYield < 100) {
                if (total < 26) {
                    break;
                }
                total -= 26;
                break;
            }
            total += startingYield - 26;
            startingYield -= 10;
            workingDays++;
        }

        System.out.println(workingDays);
        System.out.println(total);
    }
}
