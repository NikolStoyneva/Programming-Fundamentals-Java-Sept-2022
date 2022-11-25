package ObjectsAndClasses.MoreExercise.P03CarSalesman;

public class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine (String model, int power) {
        this.model = model;
        this.power = power;
    }

    public Engine (String model, int power, int displacement) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
    }

    public Engine (String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, String efficiency) {
        this.model = model;
        this.power = power;
        this.efficiency = efficiency;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }
}
