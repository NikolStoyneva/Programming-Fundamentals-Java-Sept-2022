package Basic.Syntax.Conditional.Statements.And.Loops.More.Exercises;

import java.util.Scanner;

public class P03GameStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());

        double cashIn = currentBalance;
        String command = scanner.nextLine();

        while (!command.equals("Game Time")) {
            String game = command;

            switch (game) {
                case "OutFall 4":
                    if (currentBalance >= 39.99) {
                        System.out.println("Bought OutFall 4");
                        currentBalance -= 39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (currentBalance >= 15.99) {
                        System.out.println("Bought CS: OG");
                        currentBalance -= 15.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (currentBalance >= 19.99) {
                        System.out.println("Bought Zplinter Zell");
                        currentBalance -= 19.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (currentBalance >= 59.99) {
                        System.out.println("Bought Honored 2");
                        currentBalance -= 59.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (currentBalance >= 29.99) {
                        System.out.println("Bought RoverWatch");
                        currentBalance -= 29.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (currentBalance >= 39.99) {
                        System.out.println("Bought RoverWatch Origins Edition");
                        currentBalance -= 39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }

            if (currentBalance == 0) {
                System.out.println("Out of money!");
                break;
            }
            command = scanner.nextLine();
        }

        if (currentBalance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", cashIn - currentBalance, currentBalance);
        }
    }
}
