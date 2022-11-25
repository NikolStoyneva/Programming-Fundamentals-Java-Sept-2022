package FinalExam.ProgrammingFundamentals.FinalExam02;

import java.util.*;

public class P03PlantDiscovery {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantRarityMap = new HashMap<>();
        Map<String, Double> plantRatingMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] plantInformation = scanner.nextLine().split("<->");
            String plant = plantInformation[0];
            int rarity = Integer.parseInt(plantInformation[1]);
            plantRarityMap.put(plant, rarity);
            plantRatingMap.put(plant, 0.0);
        }


        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String[] commandElements = command.split("[: -]+");
            String plant = commandElements[1];

            if (plantRarityMap.containsKey(plant)) {
                if (command.contains("Rate")) {
                    double rating = Double.parseDouble(commandElements[2]);
                    if (plantRatingMap.get(plant) != 0) {
                        double average = (plantRatingMap.get(plant) + rating) / 2;
                        plantRatingMap.put(plant, average);
                    } else {
                        plantRatingMap.put(plant, rating);
                    }
                } else if (command.contains("Update")) {
                    int rarity = Integer.parseInt(commandElements[2]);
                    plantRarityMap.put(plant, rarity);
                } else if (command.contains("Reset")) {
                    plantRatingMap.put(plant, 0.0);
                }
            } else {
                System.out.println("error");
            }
            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantRarityMap.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), plantRatingMap.get(entry.getKey()));
        }
    }
}
