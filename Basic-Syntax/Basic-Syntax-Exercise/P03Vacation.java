package Basic.Syntax.Conditional.Statements.And.Loops.Exercise;

import java.util.Scanner;

public class P03Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        double totalPrice = 0;

        if (typeOfGroup.equals("Students")) {
            if (day.equals("Friday")) {
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.8;
            } else if (day.equals("Sunday")) {
                price = 10.46;
            }
            if (people >= 30) {
                totalPrice = (price * people) * 0.85;
            } else {
                totalPrice = price * people;
            }
        } else if (typeOfGroup.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.9;
            } else if (day.equals("Saturday")) {
                price = 15.6;
            } else if (day.equals("Sunday")) {
                price = 16;
            }
            if (people >= 100) {
                totalPrice = (people - 10) * price;
            } else {
                totalPrice = people * price;
            }
        } else if (typeOfGroup.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.5;
            }
            if (people >= 10 && people <= 20) {
                totalPrice = (people * price) * 0.95;
            } else {
                totalPrice = people * price;
            }
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
