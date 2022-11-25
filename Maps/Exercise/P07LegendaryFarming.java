package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> materialsMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> keyMaterialsMap = new LinkedHashMap<>();

        keyMaterialsMap.put("shards", 0);
        keyMaterialsMap.put("fragments", 0);
        keyMaterialsMap.put("motes", 0);

        while (true) {
            int quantity = Integer.parseInt(scanner.next());
            String material = scanner.next().toLowerCase();

            if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                keyMaterialsMap.put(material, keyMaterialsMap.get(material) + quantity);
            } else {
                materialsMap.putIfAbsent(material, 0);
                materialsMap.put(material, materialsMap.get(material) + quantity);
            }

            if (keyMaterialsMap.get("shards") >= 250) {
                System.out.println("Shadowmourne obtained!");
                keyMaterialsMap.put(material, keyMaterialsMap.get(material) - 250);
                break;
            }
            if (keyMaterialsMap.get("fragments") >= 250) {
                System.out.println("Valanyr obtained!");
                keyMaterialsMap.put(material, keyMaterialsMap.get(material) - 250);
                break;
            }
            if (keyMaterialsMap.get("motes") >= 250) {
                System.out.println("Dragonwrath obtained!");
                keyMaterialsMap.put(material, keyMaterialsMap.get(material) - 250);
                break;
            }
        }

        for (Map.Entry<String, Integer> entry : keyMaterialsMap.entrySet()) {
            int currentValue = entry.getValue();
            if (currentValue < 0) {
                currentValue = 0;
            }
            System.out.printf("%s: %d%n", entry.getKey(), currentValue);
        }

        for (Map.Entry<String, Integer> entry : materialsMap.entrySet()) {
            int currentValue = entry.getValue();
            if (currentValue < 0) {
                currentValue = 0;
            }
            System.out.printf("%s: %d%n", entry.getKey(), currentValue);
        }
    }
}
