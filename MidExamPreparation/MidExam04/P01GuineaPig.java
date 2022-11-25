package MidExam.ProgrammingFundamentals.MidExam04;

import java.util.Scanner;

public class P01GuineaPig {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         double quantityFood = Double.parseDouble(scanner.nextLine()) * 1000;
         double quantityHay = Double.parseDouble(scanner.nextLine()) * 1000;
         double quantityCover = Double.parseDouble(scanner.nextLine());
         double guineaWeight = Double.parseDouble(scanner.nextLine());

         boolean needToGoToStore = false;

        for (int i = 1; i <= 30; i++) {
            quantityFood -= 300;

            if (i % 2 == 0) {
                quantityHay -= quantityFood * 0.05;
            }

            if (i % 3 == 0) {
                quantityCover -= guineaWeight / 3;
            }

            if ((quantityFood <= 0) || (quantityHay <= 0) || (quantityCover <= 0)) {
                needToGoToStore = true;
                break;
            }
        }

        if (needToGoToStore) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", quantityFood / 1000, quantityHay / 1000, quantityCover);
        }
    }
}
