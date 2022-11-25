package MidExam.ProgrammingFundamentals.MidExam02;

import java.util.*;
import java.util.stream.Collectors;

public class P03Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        double averageValue = 0;

        for (int element : numbersList) {
            averageValue += element;
        }

        averageValue /= numbersList.size();

        List<Integer> resultList = new ArrayList<>();

        for (int element : numbersList) {
            if (element > averageValue) {
                resultList.add(element);
            }
        }


        Collections.sort(resultList);
        Collections.reverse(resultList);

        if (resultList.size() >= 5) {
            System.out.println(resultList.subList(0, 5).toString().replaceAll("[\\[\\],]", ""));
        } else if (resultList.size() > 0) {
            System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
        } else {
            System.out.println("No");
        }
    }
}
