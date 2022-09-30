package Arrays.Exercise;

import java.util.Scanner;

public class P01Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int[] capacityArr = new int[wagons];

        int total = 0;

        for (int i = 0; i < wagons; i++) {
            capacityArr[i] = Integer.parseInt(scanner.nextLine());
            total += capacityArr[i];
        }
        for (int item : capacityArr) {
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.print(total);
    }
}
