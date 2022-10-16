package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int bombNumber = Integer.parseInt(scanner.next());
        int power = Integer.parseInt(scanner.next());


           while (numbersList.contains(bombNumber)) {
               int indexBombNumber = 0;

               for (int i = 0; i < numbersList.size(); i++) {
                   int currentNum = numbersList.get(i);

                   if (currentNum == bombNumber) {
                       indexBombNumber = i;
                       break;
                   }
               }

               int startInterval = indexBombNumber - power;
               if (startInterval < 0) {
                   startInterval = 0;
               }

               int endInterval = indexBombNumber + power;
               if (endInterval < 0) {
                   endInterval = numbersList.size() - 1;
               }

               for (int i = 0; i < startInterval; i++) {
                  resultList.add(numbersList.get(i));
               }

               for (int i = endInterval + 1; i < numbersList.size(); i++) {
                   resultList.add(numbersList.get(i));
               }

               numbersList = resultList;
               resultList = new ArrayList<>();
           }

           int sum = 0;

       for (int element : numbersList) {
           sum += element;
       }

        System.out.println(sum);

    }
}
