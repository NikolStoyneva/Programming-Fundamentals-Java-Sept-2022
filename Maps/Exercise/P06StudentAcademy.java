package AssociativeArrays.Exercise;

import java.util.*;

public class P06StudentAcademy {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentsMap.putIfAbsent(studentName, new ArrayList<>());
            studentsMap.get(studentName).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            double averageGrade = 0;

            for (int i = 0; i < entry.getValue().size(); i++) {
                averageGrade += entry.getValue().get(i);
            }

            averageGrade /= entry.getValue().size();

            if (averageGrade >= 4.5) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), averageGrade);
            }
        }
    }
}
