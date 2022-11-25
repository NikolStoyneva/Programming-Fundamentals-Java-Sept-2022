package AssociativeArrays.Exercise;

import java.util.*;

public class P10SoftUniExamResults {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command = scanner.nextLine();

        LinkedHashMap<String, List<String>> studentsMap = new LinkedHashMap<>();
        LinkedHashMap<String, List<String>> alphaMap = new LinkedHashMap<>();

         while (!command.equals("exam finished")) {
             String[] studentInformation = command.split("-");

             if (studentInformation.length > 2) {
                 String name = studentInformation[0];
                 String alpha = studentInformation[1];
                 String points = studentInformation[2];

                 studentsMap.putIfAbsent(name, new ArrayList<>());
                 alphaMap.putIfAbsent(alpha, new ArrayList<>());

                 alphaMap.get(alpha).add(name);

                 if (studentsMap.get(name).size() <= 1) {
                     studentsMap.get(name).add(0, alpha);
                     studentsMap.get(name).add(1, points);
                 } else {
                     int currentPoints = Integer.parseInt(studentsMap.get(name).get(1));

                     if (Integer.parseInt(points) > currentPoints) {
                         studentsMap.get(name).add(1, points);
                     }
                 }
             } else {
                 String studentToRemove = studentInformation[0];

                 studentsMap.remove(studentToRemove);
             }
             command = scanner.nextLine();
         }

        System.out.println("Results:");

         for (Map.Entry<String, List<String>> entry : studentsMap.entrySet()) {
             System.out.printf("%s | %s%n", entry.getKey(), entry.getValue().get(1));
         }

        System.out.println("Submissions:");

         for (Map.Entry<String, List<String>> entry : alphaMap.entrySet()) {
             System.out.printf("%s - %d%n", entry.getKey(), entry.getValue().size());
         }
    }
}
