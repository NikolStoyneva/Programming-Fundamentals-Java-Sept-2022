package ObjectsAndClasses.MoreExercise.P02RawData;
import java.util.List;

public class Car {

    private String model;
    private Engine engine;
    private Cargo cargo;
    private List <Tyre> tyresList;

    public Car(String model, Engine engine, Cargo cargo, List<Tyre> tyresList) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tyresList = tyresList;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Tyre> getTyresList() {
        return tyresList;
    }

}