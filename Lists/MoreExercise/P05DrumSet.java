package Lists.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05DrumSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentMoney = Double.parseDouble(scanner.nextLine());

        List<Integer> inputDrumSet = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> currentDrumSet = new ArrayList<>();

        for (int i = 0; i < inputDrumSet.size(); i++) {
            currentDrumSet.add(inputDrumSet.get(i));
        }

        String command = scanner.nextLine();

        while (!command.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(command);

            for (int i = 0; i < currentDrumSet.size(); i++) {
                int currentDrum = currentDrumSet.get(i);

                currentDrumSet.set(i, currentDrum - hitPower);

                if (currentDrumSet.get(i) <= 0) {
                    int priceForNewDrum = inputDrumSet.get(i) * 3;

                    if (currentMoney >= priceForNewDrum) {
                        currentMoney -= priceForNewDrum;
                        currentDrumSet.set(i, inputDrumSet.get(i));
                    } else {
                        currentDrumSet.remove(i);
                        inputDrumSet.remove(i);
                        i--;
                    }
                }
            }

            command = scanner.nextLine();
        }


        System.out.println(currentDrumSet.toString().replaceAll("[\\[\\],]", ""));
        System.out.printf("Gabsy has %.2flv.", currentMoney);
    }
}
