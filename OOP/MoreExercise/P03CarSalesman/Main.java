package ObjectsAndClasses.MoreExercise.P03CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] engineInformation = scanner.nextLine().split(" ");
            String model = engineInformation[0];
            int power = Integer.parseInt(engineInformation[1]);
            if (engineInformation.length == 2) {
                Engine engine = new Engine(model, power);
                engine.setEfficiency("n/a");
                engine.setDisplacement(0);
                engineList.add(engine);
            } else if (engineInformation.length == 3) {
                if (Character.isDigit(engineInformation[2].charAt(0))) {
                    int displacement = Integer.parseInt(engineInformation[2]);
                    Engine engine = new Engine(model, power, displacement);
                    engine.setEfficiency("n/a");
                    engineList.add(engine);
                } else {
                    String efficiency = engineInformation[2];
                    Engine engine = new Engine(model, power, efficiency);
                    engine.setDisplacement(0);
                    engineList.add(engine);
                }

            } else if (engineInformation.length == 4) {
                if (Character.isDigit(engineInformation[2].charAt(0))) {
                    int displacement = Integer.parseInt(engineInformation[2]);
                    String efficiency = engineInformation[3];
                    Engine engine = new Engine(model, power, displacement, efficiency);
                    engineList.add(engine);
                } else {
                    int displacement = Integer.parseInt(engineInformation[3]);
                    String efficiency = engineInformation[2];
                    Engine engine = new Engine(model, power, displacement, efficiency);
                    engineList.add(engine);
                }
            }
        }

        int m = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] carInformation = scanner.nextLine().split(" ");
            String carModel = carInformation[0];
            String engineModel = carInformation[1];
            if (carInformation.length == 2) {
                Car car = new Car(carModel, engineModel);
                carList.add(car);
                car.setColor("n/a");
                car.setWeight(0);
            } else if (carInformation.length == 3) {
                if (Character.isDigit(carInformation[2].charAt(0))) {
                    int weight = Integer.parseInt(carInformation[2]);
                    Car car = new Car(carModel, engineModel, weight);
                    car.setColor("n/a");
                    carList.add(car);
                } else {
                    String color = carInformation[2];
                    Car car = new Car(carModel, engineModel, color);
                    car.setWeight(0);
                    carList.add(car);
                }
            } else if (carInformation.length == 4) {
                if (Character.isDigit(carInformation[2].charAt(0))) {
                    int weight = Integer.parseInt(carInformation[2]);
                    String color = carInformation[3];
                    Car car = new Car(carModel, engineModel, weight, color);
                    carList.add(car);
                } else {
                    String color = carInformation[2];
                    int weight = Integer.parseInt(carInformation[3]);
                    Car car = new Car(carModel, engineModel, weight, color);
                    carList.add(car);

                }
            }
        }

        for (Car car : carList) {
            String currentEngineModel = car.getEngineModel();
            System.out.println(car.getCarModel() + ":");
            System.out.println("  " + car.getEngineModel() + ":");
            for (Engine engine : engineList) {
                if (currentEngineModel.equals(engine.getModel())) {
                    System.out.println("   Power: " + engine.getPower());
                    if (engine.getDisplacement() == 0) {
                        System.out.println("   Displacement: n/a");
                    } else {
                        System.out.println("   Displacement: " + engine.getDisplacement());
                    }
                    System.out.println("   Efficiency: " + engine.getEfficiency());
                    break;
                }
            }
            if (car.getWeight() == 0) {
                System.out.println("  Weight: n/a");
            } else {
                System.out.println("  Weight: " + car.getWeight());
            }
            System.out.println("  Color: " + car.getColor());
        }
    }
}
