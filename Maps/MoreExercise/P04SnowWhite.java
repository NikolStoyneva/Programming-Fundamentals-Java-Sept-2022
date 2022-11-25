package AssociativeArrays.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P04SnowWhite {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command = scanner.nextLine();

        TreeMap<String, TreeMap<String, Integer>> dwarfMap = new TreeMap<>();

         while (!command.equals("Once upon a time")) {
             String[] commandArr = command.split(" <:> ");
             String name = commandArr[0];
             String hatColor = commandArr[1];
             int physics = Integer.parseInt(commandArr[2]);

            if (!dwarfMap.containsKey(name)) {
                dwarfMap.put(name, new TreeMap<>());
                dwarfMap.get(name).put(hatColor, physics);
            } else if (!dwarfMap.get(name).containsKey(hatColor)) {
                dwarfMap.get(name).put(hatColor, physics);
            } else if (dwarfMap.get(name).containsKey(hatColor)) {
                int currentPhysics = dwarfMap.get(name).get(hatColor);

                if (physics > currentPhysics) {
                    dwarfMap.get(name).put(hatColor, physics);
                }
            }

             command = scanner.nextLine();
         }





    }
}
