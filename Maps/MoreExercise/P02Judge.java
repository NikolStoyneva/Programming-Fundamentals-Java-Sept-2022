package AssociativeArrays.MoreExercise;

import java.util.*;

public class P02Judge {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command = scanner.nextLine();


         while (!command.equals("no more time")) {
             String[] inputArr = command.split(" -> ");
             String username = inputArr[0];
             String contest = inputArr[1];
             int points = Integer.parseInt(inputArr[2]);


             command = scanner.nextLine();
         }






    }
}
