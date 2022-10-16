package Methods.Exercise;

import java.util.Scanner;

public class P01SmallestOThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNum, secondNum, thirdNum);

    }
    public static void printSmallestNumber (int firstNum, int secondNum, int thirdNum) {

        int currentMin = Math.min(firstNum, secondNum);
        int smallestNumber = Math.min(currentMin, thirdNum);

        System.out.println(smallestNumber);
    }
}
