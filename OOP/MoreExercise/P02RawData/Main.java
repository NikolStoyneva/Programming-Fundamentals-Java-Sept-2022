package ObjectsAndClasses.MoreExercise.P02RawData;
import java.util.*;

public class Main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());
         List<Car> carsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] carInformation = scanner.nextLine().split(" ");
            String model = carInformation[0];
            int engineSpeed = Integer.parseInt(carInformation[1]);
            int enginePower = Integer.parseInt(carInformation[2]);
            int cargoWeight = Integer.parseInt(carInformation[3]);
            String cargoType = carInformation[4];

            Tyre tyre1 = new Tyre(Double.parseDouble(carInformation[5]), Integer.parseInt(carInformation[6]));
            Tyre tyre2 = new Tyre(Double.parseDouble(carInformation[7]), Integer.parseInt(carInformation[8]));
            Tyre tyre3 = new Tyre(Double.parseDouble(carInformation[9]), Integer.parseInt(carInformation[10]));
            Tyre tyre4 = new Tyre(Double.parseDouble(carInformation[11]), Integer.parseInt(carInformation[12]));

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            List<Tyre> tyreList = new ArrayList<>();
            tyreList.add(0, tyre1);
            tyreList.add(1, tyre2);
            tyreList.add(2, tyre3);
            tyreList.add(3, tyre4);

            Car car = new Car(model, engine, cargo, tyreList);
            carsList.add(car);
        }

        String command = scanner.nextLine();

        for (Car car : carsList) {
            String currentCargoType = car.getCargo().getType();

            if (currentCargoType.equals(command)) {
                if (command.equals("fragile")) {
                    boolean isValid = false;
                    for (int i = 0; i < car.getTyresList().size(); i+=2) {
                       Tyre currentTyre = car.getTyresList().get(0);
                        if (currentTyre.getTyrePressure() < 1) {
                            isValid = true;
                            break;
                        }
                    }
                    if (isValid) {
                        System.out.println(car.getModel());
                    }
                } else if (command.equals("flamable")) {
                    if (car.getEngine().getPower() > 250) {
                        System.out.println(car.getModel());
                    }
                }
            }
        }
    }
}
