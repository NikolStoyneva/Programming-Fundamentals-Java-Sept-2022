package ObjectsAndClasses.Exercise.P05VehicleCatalogue;

import java.util.Locale;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private int horsepower;


    public Vehicle (String type, String model, String color, int horsepower) {
        this.type = type.substring(0, 1).toUpperCase() + type.substring(1);
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
