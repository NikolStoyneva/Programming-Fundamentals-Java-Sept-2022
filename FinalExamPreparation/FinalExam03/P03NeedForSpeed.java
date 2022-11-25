package FinalExam.ProgrammingFundamentals.FinalExam03;

import java.util.*;

public class P03NeedForSpeed {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Integer>> carsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] carInformationArr = scanner.nextLine().split("\\|");
            String car = carInformationArr[0];
            int mileage = Integer.parseInt(carInformationArr[1]);
            int fuel = Integer.parseInt(carInformationArr[2]);

            carsMap.putIfAbsent(car, new ArrayList<>());
            carsMap.get(car).add(0, mileage);
            carsMap.get(car).add(1, fuel);
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] commandArr = command.split(" : ");

            if (command.contains("Drive")) {
                String car = commandArr[1];
                int mileage = Integer.parseInt(commandArr[2]);
                int fuel = Integer.parseInt(commandArr[3]);

               if (carsMap.get(car).get(1) >= fuel) {
                   carsMap.get(car).set(0, mileage + carsMap.get(car).get(0));
                   carsMap.get(car).set(1, carsMap.get(car).get(1) - fuel);
                   System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, mileage, fuel);
               } else {
                   System.out.println("Not enough fuel to make that ride");
               }

               if (carsMap.get(car).get(0) >= 100000) {
                   System.out.printf("Time to sell the %s!%n", car);
                   carsMap.remove(car);
               }

            } else if (command.contains("Refuel")) {
                String car = commandArr[1];
                int fuel = Integer.parseInt(commandArr[2]);
                int currentFuel = carsMap.get(car).get(1);
                int refilledFuel = fuel + carsMap.get(car).get(1);

                if (refilledFuel > 75) {
                    refilledFuel = 75;
                }

                carsMap.get(car).set(1, refilledFuel);

                System.out.printf("%s refueled with %d liters%n", car, refilledFuel - currentFuel);
            } else if (command.contains("Revert")) {
                String car = commandArr[1];
                int km = Integer.parseInt(commandArr[2]);
                int currentKm = carsMap.get(car).get(0);
                int decreasedKm = carsMap.get(car).get(0) - km;

                if (decreasedKm < 10000) {
                    decreasedKm = 10000;
                } else {
                    System.out.printf("%s mileage decreased by %d kilometers%n", car, currentKm - decreasedKm);
                }

                carsMap.get(car).set(0, decreasedKm);
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : carsMap.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }

    }
}
