package MidExam.ProgrammingFundamentals.MidExam01;

import java.util.Arrays;
import java.util.Scanner;

public class P02TheLift {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int waitingPeople = Integer.parseInt(scanner.nextLine());

         int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                 .mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < numbersArr.length; i++) {
            int freeSeats = 4 - numbersArr[i];

            if (freeSeats > 0) {

                if (waitingPeople >= freeSeats) {
                    waitingPeople -= freeSeats;

                    numbersArr[i] = 4;
                } else if (waitingPeople < freeSeats) {
                    numbersArr[i] = waitingPeople + numbersArr[i];
                    waitingPeople = 0;
                }
            }

            if (waitingPeople <= 0) {
                break;
            }

        }

        boolean emptySpots = false;

        for (int element : numbersArr) {
            if (element < 4) {
                emptySpots = true;
                break;
            }
        }

        if (emptySpots) {
            System.out.println("The lift has empty spots!");
        } else if (waitingPeople > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
        }

        for (int element : numbersArr) {
            System.out.print(element + " ");
        }
    }
}
