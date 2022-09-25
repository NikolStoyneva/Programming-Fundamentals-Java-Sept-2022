package Data.Types.And.Variables.Exercise;

import java.util.Scanner;

public class P07WaterOverflow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int currentLiters = 0;

        for (int i = 1; i <= n; i++) {
            int litersToBeAdded = Integer.parseInt(scanner.nextLine());

            if (currentLiters + litersToBeAdded > 255) {
                System.out.println("Insufficient capacity!");
                continue;
            } else {
                currentLiters += litersToBeAdded;
            }
        }
        System.out.println(currentLiters);
    }
}
