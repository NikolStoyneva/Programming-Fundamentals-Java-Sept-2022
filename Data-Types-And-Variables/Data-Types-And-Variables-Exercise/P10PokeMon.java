package Data.Types.And.Variables.Exercise;

import java.util.Scanner;

public class P10PokeMon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());

        int halfN = pokePowerN / 2;
        int counterPokes = 0;


        while (pokePowerN >= distanceM) {
            pokePowerN -= distanceM;
            counterPokes++;

            if (pokePowerN == halfN && exhaustionFactorY != 0) {
                pokePowerN /= exhaustionFactorY;
            }
        }

        System.out.println(pokePowerN);
        System.out.println(counterPokes);
    }
}
