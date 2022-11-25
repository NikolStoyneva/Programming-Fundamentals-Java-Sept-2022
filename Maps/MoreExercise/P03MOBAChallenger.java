package AssociativeArrays.MoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P03MOBAChallenger {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command = scanner.nextLine();

         TreeMap<String, Map<String, Integer>> playersMap = new TreeMap<>();

         while (!command.equals("Season end")) {
             String[] inputArr;

             if (command.contains("vs")) {
                 inputArr = command.split(" vs ");
                 String firstPlayer = inputArr[0];
                 String secondPlayer = inputArr[1];

                 if (playersMap.containsKey(firstPlayer) && playersMap.containsKey(secondPlayer)) {

                     for (Map.Entry<String, Integer> firstEntry : playersMap.get(firstPlayer).entrySet()) {
                         String firstPosition = firstEntry.getKey();
                         for (Map.Entry<String, Integer> secondEntry : playersMap.get(secondPlayer).entrySet()) {
                             String secondPosition = secondEntry.getKey();

                             if (firstPosition.equals(secondPosition)) {
                                 if (firstEntry.getValue() < secondEntry.getValue()) {
                                     playersMap.remove(firstPlayer);
                                     break;
                                 } else if (firstEntry.getValue() > secondEntry.getValue()) {
                                     playersMap.remove(secondPlayer);
                                     break;
                                 }
                             }
                         }
                     }
                 }
             } else {
                 inputArr = command.split(" -> ");
                 String player = inputArr[0];
                 String position = inputArr[1];
                 int skill = Integer.parseInt(inputArr[2]);

                 if (playersMap.containsKey(player)) {
                     if (playersMap.get(player).containsKey(position)) {
                         playersMap.get(player).put(position, Math.max(skill, playersMap.get(player).get(position)));
                     } else {
                         playersMap.get(player).put(position, skill);
                     }
                 } else {
                     playersMap.put(player, new TreeMap<>());
                     playersMap.get(player).put(position, skill);
                 }
             }
             command = scanner.nextLine();
         }


        playersMap.entrySet()
                .stream()
                .sorted((p1, p2) -> {
                    int result = Integer.compare(p2.getValue().values().stream().mapToInt(i -> i).sum(),
                            p1.getValue().values().stream().mapToInt(i -> i).sum());
                    if (result == 0) {
                        result = p1.getKey().compareTo(p2.getKey());
                    }
                    return result;
                })
                .forEach(entry -> {
                    System.out.printf("%s: %d skill%n", entry.getKey(), entry.getValue().values().stream().mapToInt(i -> i).sum());
                    entry.getValue()
                            .entrySet()
                            .stream()
                            .sorted((e1, e2) -> {
                                int res = Integer.compare(e2.getValue(), e1.getValue());
                                if (res == 0) {
                                    res = e1.getKey().compareTo(e2.getKey());
                                }
                                return res;
                            }).forEach(e -> {
                                System.out.printf("- %s <::> %d%n", e.getKey(), e.getValue());
                            });
                });

    }
}
