package FinalExam.ProgrammingFundamentals.FinalExam05;

import java.util.*;

public class P03Pirates {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();

        LinkedHashMap<String, List<Integer>> citiesInformationMap = new LinkedHashMap<>();

         while (!input.equals("Sail")) {
             String[] inputArr = input.split("\\|\\|");
             String city = inputArr[0];
             int population = Integer.parseInt(inputArr[1]);
             int gold = Integer.parseInt(inputArr[2]);

             if (citiesInformationMap.containsKey(city)) {
                 int updatedPopulation = citiesInformationMap.get(city).get(0) + population;
                 int updatedGold = citiesInformationMap.get(city).get(1) + gold;

                 citiesInformationMap.get(city).set(0, updatedPopulation);
                 citiesInformationMap.get(city).set(1, updatedGold);
             } else {
                 citiesInformationMap.put(city, new ArrayList<>());
                 citiesInformationMap.get(city).add(0, population);
                 citiesInformationMap.get(city).add(1, gold);
             }

             input = scanner.nextLine();
         }

         input = scanner.nextLine();

         while (!input.equals("End")) {
             String[] actionsArr = input.split("=>");

             if (input.contains("Plunder")) {
                 String city = actionsArr[1];
                 int population = Integer.parseInt(actionsArr[2]);
                 int gold = Integer.parseInt(actionsArr[3]);

                 int currentPeople = citiesInformationMap.get(city).get(0);
                 int currentGold = citiesInformationMap.get(city).get(1);
                 int updatedPeople = currentPeople - population;
                 int updatedGold = currentGold - gold;

                 if (updatedPeople < 0) {
                     updatedPeople = 0;
                 }
                 if (updatedGold < 0) {
                     updatedGold = 0;
                 }

                 System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, currentGold - updatedGold, currentPeople - updatedPeople);
                 citiesInformationMap.get(city).set(0, updatedPeople);
                 citiesInformationMap.get(city).set(1, updatedGold);

                 if ((updatedPeople == 0) || (updatedGold == 0)) {
                     citiesInformationMap.remove(city);
                     System.out.printf("%s has been wiped off the map!%n", city);
                 }

             } else if (input.contains("Prosper")) {
                 String city = actionsArr[1];
                 int gold = Integer.parseInt(actionsArr[2]);

                 if (gold < 0) {
                     System.out.printf("Gold added cannot be a negative number!%n");
                 } else {
                     int currentGold = citiesInformationMap.get(city).get(1);
                     int updatedGold = currentGold + gold;

                     citiesInformationMap.get(city).set(1, updatedGold);

                     System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, city, updatedGold);
                 }
             }
             input = scanner.nextLine();
         }

         if (citiesInformationMap.size() > 0) {
             System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", citiesInformationMap.size());
             for (Map.Entry<String, List<Integer>> entry : citiesInformationMap.entrySet()) {
                 System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
             }
         } else {
             System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
         }
    }
}
