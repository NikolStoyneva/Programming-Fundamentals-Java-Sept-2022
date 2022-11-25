package MidExam.ProgrammingFundamentals.MidExam03;

import java.util.Scanner;

public class P01CounterStrike {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


         int initialEnergy = Integer.parseInt(scanner.nextLine());

         String command = scanner.nextLine();

         int wonBattles = 0;

         boolean gameOver = false;

         while (!command.equals("End of battle")) {
             int distanceToEnemy = Integer.parseInt(command);

              if (initialEnergy >= distanceToEnemy) {
                  wonBattles++;
                  initialEnergy -= distanceToEnemy;
              } else {
                  System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, initialEnergy);
                  gameOver = true;
                  break;
              }

           if (wonBattles % 3 == 0) {
               initialEnergy += wonBattles;
           }                                  

             command = scanner.nextLine();
         }

         if (!gameOver) {
             System.out.printf("Won battles: %d. Energy left: %d", wonBattles, initialEnergy);
         }
    }
}
