package AssociativeArrays.Exercise;

import java.util.*;

public class P09ForceBook {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command = scanner.nextLine();

        LinkedHashMap<String, List<String>> sideMap = new LinkedHashMap<>();

         while (!command.equals("Lumpawaroo")) {
             String side = "";
             String user = "";

             if (command.contains("|")) {
                 String[] inputInformation = command.split(" \\| ");
                 side = inputInformation[0];
                 user = inputInformation[1];
             } else {
                 String[] inputInformation = command.split(" -> ");
                 side = inputInformation[1];
                 user = inputInformation[0];
                 System.out.printf("%s joins the %s side!%n", user, side);
             }

             sideMap.putIfAbsent(side, new ArrayList<>());

             for (Map.Entry<String, List<String>> entry : sideMap.entrySet()) {
                 for (int i = 0; i < entry.getValue().size(); i++) {
                     if (user.equals(entry.getValue().get(i))) {
                         entry.getValue().remove(i);
                         break;
                     }
                 }
             }

             sideMap.get(side).add(user);

             command = scanner.nextLine();
         }

        for (Map.Entry<String, List<String>> entry : sideMap.entrySet()) {
            if (entry.getValue().size() > 0) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                for (int i = 0; i < entry.getValue().size(); i++) {
                    System.out.printf("! %s%n", entry.getValue().get(i));
                }
            }
        }

    }
}
