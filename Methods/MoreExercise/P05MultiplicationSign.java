package Methods.MoreExercise;

import java.util.Scanner;

public class P05MultiplicationSign {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        printSignOfNumber(firstNum, secondNum, thirdNum);
    }
    public static void printSignOfNumber (int firstNum, int secondNum, int thirdNum) {
        int[] numbersArr = {
                firstNum,
                secondNum,
                thirdNum
        };
        int negative = 0;
        boolean isZero = false;

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] < 0) {
                negative++;
            } else if (numbersArr[i] == 0) {
                isZero = true;
                System.out.println("zero");
                break;
            }
        }
        if (!isZero) {
            if (negative % 2 != 0) {
                System.out.println("negative");
            } else {
                System.out.println("positive");
            }
        }
    }
}
