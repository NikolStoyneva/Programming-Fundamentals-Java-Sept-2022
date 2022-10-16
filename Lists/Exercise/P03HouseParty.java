package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> guestsNames = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            String name = command[0];

            if (command[2].equals("not")) {

                if (guestsNames.contains(name)) {
                    guestsNames.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }

            } else {
                if (guestsNames.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guestsNames.add(name);
                }
            }
        }

        for (String name : guestsNames) {
            System.out.println(name);
        }
    }
}
