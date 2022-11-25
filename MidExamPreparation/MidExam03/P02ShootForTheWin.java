package MidExam.ProgrammingFundamentals.MidExam03;

import java.util.Arrays;
import java.util.Scanner;

public class P02ShootForTheWin {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                 .mapToInt(Integer::parseInt).toArray();

         String command = scanner.nextLine();

         int shotTargets = 0;

         while (!command.equals("End")) {
             int currentIndex = Integer.parseInt(command);

             if (isValidIndex(numbersArr, currentIndex) && numbersArr[currentIndex] != -1) {
                 int currentValue = numbersArr[currentIndex];
                 numbersArr[currentIndex] = -1;
                 shotTargets++;

                 for (int i = 0; i < numbersArr.length; i++) {
                     if (numbersArr[i] != -1) {
                         if (numbersArr[i] > currentValue) {
                             numbersArr[i] = numbersArr[i] - currentValue;
                         } else {
                             numbersArr[i] = numbersArr[i] + currentValue;
                         }
                     }
                 }
             }
             command = scanner.nextLine();
         }

        System.out.printf("Shot targets: %d -> ", shotTargets);
       for (int element : numbersArr) {
           System.out.print(element + " ");
       }
    }
    public static boolean isValidIndex (int[] numbersArr, int index) {
        return (index >= 0 && index < numbersArr.length);
    }
}
