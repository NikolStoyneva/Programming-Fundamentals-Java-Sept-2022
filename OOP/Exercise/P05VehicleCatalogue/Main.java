package ObjectsAndClasses.Exercise.P05VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String command = scanner.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();

        double trucksPower = 0;
        double carsPower = 0;

        int cars = 0;
        int trucks = 0;

         while (!command.equals("End")) {
             String[] vehicleInformation = command.split(" ");

             String type = vehicleInformation[0];
             String model = vehicleInformation[1];
             String color = vehicleInformation[2];
             int horsepower = Integer.parseInt(vehicleInformation[3]);

             Vehicle vehicle = new Vehicle(type, model, color, horsepower);

             if (vehicle.getType().equals("Car")) {
                 cars++;
                 carsPower += vehicle.getHorsepower();
             } else {
                 trucks++;
                 trucksPower += vehicle.getHorsepower();
             }

             vehicleList.add(vehicle);

             command = scanner.nextLine();
         }

         String modelOfVehicle = scanner.nextLine();
         List<Vehicle> output = new ArrayList<>();

         while (!modelOfVehicle.equals("Close the Catalogue")) {
             String currentModel = modelOfVehicle;

             for (Vehicle vehicle : vehicleList) {
                 if (vehicle.getModel().equals(currentModel)) {
                     output.add(vehicle);
                 }

             }

             modelOfVehicle = scanner.nextLine();
         }



         for (Vehicle vehicle : output) {

             System.out.println("Type: " + vehicle.getType());
             System.out.println("Model: " + vehicle.getModel());
             System.out.println("Color: " + vehicle.getColor());
             System.out.println("Horsepower: " + vehicle.getHorsepower());
         }

         carsPower /= cars;
         trucksPower /= trucks;

         if (cars <= 0) {
             carsPower = 0;
         }
         if (trucks <= 0) {
             trucksPower = 0;
         }
        System.out.printf("Cars have average horsepower of: %.2f.%n", carsPower);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", trucksPower);
    }
}
