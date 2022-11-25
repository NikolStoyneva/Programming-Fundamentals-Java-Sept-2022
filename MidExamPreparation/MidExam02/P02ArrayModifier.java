package MidExam.ProgrammingFundamentals.MidExam02;

import java.util.Arrays;
import java.util.Scanner;

public class P02ArrayModifier {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                 .mapToInt(Integer::parseInt).toArray();

         String command = scanner.nextLine();

         while (!command.equals("end")) {
             String[] commandElements = command.split(" ");

             if (commandElements[0].equals("swap")) {
                 int index1 = Integer.parseInt(commandElements[1]);
                 int index2 = Integer.parseInt(commandElements[2]);

                 int elementIndex1 = numbersArr[index1];

                 numbersArr[index1] = numbersArr[index2];
                 numbersArr[index2] = elementIndex1;

             } else if (commandElements[0].equals("multiply")) {
                 int index1 = Integer.parseInt(commandElements[1]);
                 int index2 = Integer.parseInt(commandElements[2]);

                 numbersArr[index1] = numbersArr[index1] * numbersArr[index2];

             } else if (commandElements[0].equals("decrease")) {

                 for (int i = 0; i < numbersArr.length; i++) {
                     numbersArr[i]--;
                 }
             }

             command = scanner.nextLine();
         }

        for (int i = 0; i < numbersArr.length - 1; i++) {
            System.out.print(numbersArr[i] + ", ");
        }
        System.out.print(numbersArr[numbersArr.length - 1]);
    }
}
