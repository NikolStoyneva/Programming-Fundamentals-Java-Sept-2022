package AssociativeArrays.Exercise;

import java.util.*;

public class P08CompanyUsers {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command = scanner.nextLine();

        LinkedHashMap<String, List<String>> employeesMap = new LinkedHashMap<>();

         while (!command.equals("End")) {
             String[] inputArr = command.split(" -> ");
             String company = inputArr[0];
             String id = inputArr[1];

             employeesMap.putIfAbsent(company, new ArrayList<>());
             boolean newId = true;

             for (int i = 0; i < employeesMap.get(company).size(); i++) {
                 if (id.equals(employeesMap.get(company).get(i))) {
                     newId = false;
                     break;
                 }
             }
             if (newId) {
                employeesMap.get(company).add(id);
             }

             command = scanner.nextLine();
         }

         for (Map.Entry<String, List<String>> entry : employeesMap.entrySet()) {
             System.out.println(entry.getKey());
             for (int i = 0; i < entry.getValue().size(); i++) {
                 System.out.printf("-- %s%n", entry.getValue().get(i));
             }
         }
    }
}
