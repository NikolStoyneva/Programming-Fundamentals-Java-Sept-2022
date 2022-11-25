package AssociativeArrays.Exercise;

import java.util.*;

public class P05Courses {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command = scanner.nextLine();

        LinkedHashMap<String, List<String>> coursesMap = new LinkedHashMap<>();

         while (!command.equals("end")) {
             String[] inputArr = command.split(" : ");

             String courseName = inputArr[0];
             String studentName = inputArr[1];

             coursesMap.putIfAbsent(courseName, new ArrayList<>());

             coursesMap.get(courseName).add(studentName);

             command = scanner.nextLine();
         }

         for (Map.Entry<String, List<String>> entry : coursesMap.entrySet()) {
             System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
             for (int i = 0; i < entry.getValue().size(); i++) {
                 System.out.printf("-- %s%n", entry.getValue().get(i));
             }
         }
    }
}
