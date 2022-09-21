package Basic.Syntax.Conditional.Statements.And.Loops.Exercise;

import java.util.Scanner;

public class P07VendingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double sum = 0;

        while (!command.equals("Start")) {
            double moneyInput = Double.parseDouble(command);

            if ((moneyInput == 0.1) || (moneyInput == 0.2) || (moneyInput == 0.5) || (moneyInput == 1) || (moneyInput == 2)) {
                sum += moneyInput;
            } else {
                System.out.printf("Cannot accept %.2f%n", moneyInput);
            }
            command = scanner.nextLine();
        }

        String product = scanner.nextLine();

        while (!product.equals("End")) {

            switch (product) {
                case "Nuts":
                    if (sum >= 2) {
                        sum -= 2;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        sum -= 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        sum -= 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        sum -= 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >= 1) {
                        sum -= 1;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
