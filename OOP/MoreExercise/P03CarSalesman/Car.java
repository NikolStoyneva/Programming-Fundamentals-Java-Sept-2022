package ObjectsAndClasses.MoreExercise.P03CarSalesman;

public class Car {
    private String carModel;
    private String engineModel;
    private int weight;
    private String color;

    public Car (String carModel, String engineModel, int weight, String color) {
        this.carModel = carModel;
        this.engineModel = engineModel;
        this.weight = weight;
        this.color = color;
    }

    public Car (String carModel, String engineModel) {
        this.carModel = carModel;
        this.engineModel = engineModel;
    }

    public Car (String carModel, String engineModel, int weight) {
        this.carModel = carModel;
        this.engineModel = engineModel;
        this.weight = weight;
    }

    public Car (String carModel, String engineModel, String color) {
        this.carModel = carModel;
        this.engineModel = engineModel;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
