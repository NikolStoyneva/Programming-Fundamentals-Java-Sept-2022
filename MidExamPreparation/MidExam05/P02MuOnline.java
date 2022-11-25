package MidExam.ProgrammingFundamentals.MidExam05;

import java.util.Scanner;

public class P02MuOnline {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String[] inputLine = scanner.nextLine().split("\\|");

         int health = 100;
         int bitcoins = 0;

         boolean isDead = false;

        for (int i = 0; i < inputLine.length; i++) {
            String[] currentArr = inputLine[i].split(" ");

            if (currentArr[0].equals("potion")) {
                int currentHealthToAdd = Integer.parseInt(currentArr[1]);

                if (currentHealthToAdd > 100 - health) {
                    currentHealthToAdd = 100 - health;
                }

                health += currentHealthToAdd;

                System.out.printf("You healed for %d hp.%n", currentHealthToAdd);
                System.out.printf("Current health: %d hp.%n", health);

            } else if (currentArr[0].equals("chest")) {
                bitcoins += Integer.parseInt(currentArr[1]);

                System.out.printf("You found %d bitcoins.%n", Integer.parseInt(currentArr[1]));
            } else {

                health -= Integer.parseInt(currentArr[1]);

                if (health > 0) {
                    System.out.printf("You slayed %s.%n", currentArr[0]);
                } else {
                    System.out.printf("You died! Killed by %s.%n", currentArr[0]);
                    System.out.printf("Best room: %d%n", i + 1);
                    isDead = true;
                    break;
                }
            }
        }

        if (!isDead) {
            System.out.printf("You've made it!%n");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}
