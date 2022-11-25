package MidExam.ProgrammingFundamentals.MidExam06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ManOWar {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxHealthCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        boolean youWon = false;
        boolean youLost = false;

        while (!command.equals("Retire")) {
            String[] commandElements = command.split(" ");

            switch (commandElements[0]) {
                case "Fire":
                    int fireIndex = Integer.parseInt(commandElements[1]);
                    int damageFire = Integer.parseInt(commandElements[2]);

                    if (isValidIndex(warShip, fireIndex)) {

                        warShip.set(fireIndex, warShip.get(fireIndex) - damageFire);

                        if (warShip.get(fireIndex) <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            youWon = true;
                            break;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(commandElements[1]);
                    int endIndex = Integer.parseInt(commandElements[2]);
                    int damageDefend = Integer.parseInt(commandElements[3]);

                    if (isValidIndex(pirateShip, startIndex) && isValidIndex(pirateShip, endIndex)) {

                        for (int i = startIndex; i <= endIndex; i++) {

                            pirateShip.set(i, pirateShip.get(i) - damageDefend);

                            if (pirateShip.get(i) <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                youLost = true;
                                break;
                            }
                        }


                    }

                    break;
                case "Repair":
                    int repairIndex = Integer.parseInt(commandElements[1]);
                    int health = Integer.parseInt(commandElements[2]);

                    if (isValidIndex(pirateShip, repairIndex)) {

                        pirateShip.set(repairIndex, pirateShip.get(repairIndex) + health);

                                if (pirateShip.get(repairIndex) > maxHealthCapacity) {
                                    pirateShip.set(repairIndex, maxHealthCapacity);
                                }

                    }

                    break;
                case "Status":
                    double needRepairBorder = maxHealthCapacity * 0.2;
                    int countForRepair = 0;

                    for (int i = 0; i < pirateShip.size(); i++) {
                        if (pirateShip.get(i) < needRepairBorder) {
                            countForRepair++;
                        }
                    }

                    System.out.printf("%d sections need repair.%n", countForRepair);
                    break;
            }

            if (youWon || youLost) {
                break;
            }
            command = scanner.nextLine();
        }

        if (!youWon && !youLost) {
            int pirateSum = 0;
            int warshipSum = 0;

           for (int element : pirateShip) {
               pirateSum += element;
           }

           for (int element : warShip) {
               warshipSum += element;
           }

            System.out.printf("Pirate ship status: %d%n", pirateSum);
            System.out.printf("Warship status: %d", warshipSum);
        }
    }
    public static boolean isValidIndex (List<Integer> numbers, int index) {
        return (index >= 0 && index < numbers.size());
    }
}
