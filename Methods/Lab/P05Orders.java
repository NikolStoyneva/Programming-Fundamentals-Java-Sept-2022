package Methods.Lab;

import java.util.Scanner;

public class P05Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product) {
            case "coffee":
                coffeeOrder(quantity);
                break;
            case "water":
                waterOrder(quantity);
                break;
            case "snacks":
                snacksOrder(quantity);
                break;
            case "coke":
                cokeOrder(quantity);
                break;
        }

    }
    public static void coffeeOrder (int quantity) {
        double price = quantity * 1.5;
        System.out.printf("%.2f", price);
    }
    public static void waterOrder (int quantity) {
        double price = quantity * 1.0;
        System.out.printf("%.2f", price);
    }
    public static void cokeOrder (int quantity) {
        double price = quantity * 1.4;
        System.out.printf("%.2f", price);
    }
    public static void snacksOrder (int quantity) {
        double price = quantity * 2.0;
        System.out.printf("%.2f", price);
    }
}
