package MidExam.ProgrammingFundamentals.MidExam01;

import java.util.Scanner;

public class P01ComputerStore {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command = scanner.nextLine();

         double price = 0;
         double totalPrice = 0;
         double taxes = 0;

         while (!command.equals("special") && !command.equals("regular")) {
             double currentPrice = Double.parseDouble(command);

             if (currentPrice <= 0) {
                 System.out.println("Invalid price!");
             } else {
                 price += currentPrice;
                 taxes += currentPrice * 0.2;
             }

             command = scanner.nextLine();
         }

        totalPrice = price + taxes;

         if (totalPrice > 0) {
             if (command.equals("special")) {
                 totalPrice *= 0.9;
             }

             System.out.printf("Congratulations you've just bought a new computer!%n" +
                     "Price without taxes: %.2f$%n" +
                     "Taxes: %.2f$%n" +
                     "-----------%n" +
                     "Total price: %.2f$", price, taxes, totalPrice);
         } else {
             System.out.println("Invalid order!");
         }
    }
}
