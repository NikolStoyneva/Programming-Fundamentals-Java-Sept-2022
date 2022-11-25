package AssociativeArrays.Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command = scanner.nextLine();

        LinkedHashMap<String, Integer> resourcesMap = new LinkedHashMap<>();

         while (!command.equals("stop")) {
             String resource = command;
             int quantity = Integer.parseInt(scanner.nextLine());

             resourcesMap.putIfAbsent(resource, 0);

             resourcesMap.put(resource, resourcesMap.get(resource) + quantity);

             command = scanner.nextLine();
         }

        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
