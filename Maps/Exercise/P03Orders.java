package AssociativeArrays.Exercise;
import java.util.*;


public class P03Orders {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command = scanner.nextLine();

        LinkedHashMap<String, List<Double>> productsMap = new LinkedHashMap<>();

         while (!command.equals("buy")) {
             String[] productsArr = command.split(" ");
             String product = productsArr[0];
             double price = Double.parseDouble(productsArr[1]);
             double quantity = Double.parseDouble(productsArr[2]);

             if (!productsMap.containsKey(product)) {
                 productsMap.put(product, new ArrayList<>());
                 productsMap.get(product).add(0, price);
                 productsMap.get(product).add(1, quantity);
             } else {
                 productsMap.get(product).set(0, price);
                 productsMap.get(product).set(1, productsMap.get(product).get(1) + quantity);
             }

             command = scanner.nextLine();
         }

        for (Map.Entry<String, List<Double>> entry : productsMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1));
        }

    }
}
