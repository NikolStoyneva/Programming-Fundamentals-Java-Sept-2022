package Arrays.Exercise;

import java.util.Scanner;

public class P02CommonElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < firstArr.length; j++) {
                if (secondArr[i].equals(firstArr[j])) {
                    output.append(secondArr[i]).append(" ");
                }
            }
        }

        System.out.println(output);
    }
}
