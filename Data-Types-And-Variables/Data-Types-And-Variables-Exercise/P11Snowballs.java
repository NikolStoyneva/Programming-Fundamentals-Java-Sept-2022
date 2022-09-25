package Data.Types.And.Variables.Exercise;

import java.util.Scanner;

public class P11Snowballs {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner (System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());

        long highestSnowballValue = 0;
        int snowBestOne = 0;
        int timeBestOne = 0;
        int qualityBestOne = 0;

        for (int i = 1; i <= numberOfSnowballs; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

            int partOfSolution = snow / time;
            long currentValue = (long) Math.pow(snow / time, quality);

            if (currentValue > highestSnowballValue) {
                highestSnowballValue = currentValue;
                snowBestOne = snow;
                timeBestOne = time;
                qualityBestOne = quality;
            }
        }

        System.out.printf("%d : %d = %d (%d)", snowBestOne, timeBestOne, highestSnowballValue, qualityBestOne);
    }
}
