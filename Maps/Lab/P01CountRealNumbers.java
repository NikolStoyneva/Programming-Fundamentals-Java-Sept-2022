package AssociativeArrays.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         double[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                 .mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> numbersMap = new TreeMap<>();

         for (double num : numbersArr) {
            numbersMap.putIfAbsent(num, 0);
            numbersMap.put(num, numbersMap.get(num) + 1);
         }

        for (Map.Entry<Double, Integer> entry : numbersMap.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.###########");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }


    }
}
