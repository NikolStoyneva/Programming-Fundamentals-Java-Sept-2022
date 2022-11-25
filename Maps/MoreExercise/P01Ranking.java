package AssociativeArrays.MoreExercise;

import java.util.*;

public class P01Ranking {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String firstInput = scanner.nextLine();

         LinkedHashMap<String, String> contestsMap = new LinkedHashMap<>();

         while (!firstInput.equals("end of contests")) {
             String[] contestArr = firstInput.split(":");
             String contest = contestArr[0];
             String password = contestArr[1];

             contestsMap.put(contest, password);

             firstInput = scanner.nextLine();
         }

         String secondInput = scanner.nextLine();
         TreeMap<String, TreeMap<String, Integer>> submissionsMap = new TreeMap<>();

         while (!secondInput.equals("end of submissions")) {
             String[] submissionsArr = secondInput.split("=>");
             String contest = submissionsArr[0];
             String password = submissionsArr[1];
             String username = submissionsArr[2];
             int points = Integer.parseInt(submissionsArr[3]);

             if (contestsMap.containsKey(contest) && contestsMap.get(contest).equals(password)) {

                     submissionsMap.putIfAbsent(username, new TreeMap<>());

                 if (submissionsMap.get(username).containsKey(contest)) {
                     if (points > submissionsMap.get(username).get(contest)) {
                         submissionsMap.get(username).put(contest, points);
                     }
                 } else {
                     submissionsMap.get(username).put(contest, points);
                 }
             }

             secondInput = scanner.nextLine();
         }

         String bestStudent = "";
         int maxPoints = Integer.MIN_VALUE;


         List<Integer> pointsList = new ArrayList<>();

        for (Map.Entry<String, TreeMap<String, Integer>> entry : submissionsMap.entrySet()) {
            int currentPoints = 0;

                for (Map.Entry<String, Integer> integerEntry : entry.getValue().entrySet()) {
                    currentPoints += integerEntry.getValue();
                    pointsList.add(integerEntry.getValue());
                }

                if (currentPoints > maxPoints) {
                    maxPoints = currentPoints;
                    bestStudent = entry.getKey();
                }
        }

        Collections.sort(pointsList);
        Collections.reverse(pointsList);

        System.out.printf("Best candidate is %s with total %d points.%n", bestStudent, maxPoints);
        System.out.println("Ranking:");


        submissionsMap.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.entrySet().stream().
                    sorted((f, s) -> s.getValue() - f.getValue()).
                    forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
        });

    }
}
