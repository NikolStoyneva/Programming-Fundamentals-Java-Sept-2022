package ObjectsAndClasses.MoreExercise.P02RawData;

public class Tyre {

    private double tyrePressure;
    private int tyreAge;

    public Tyre (double tyrePressure, int tyreAge) {
        this.tyreAge = tyreAge;
        this.tyrePressure = tyrePressure;
    }

    public double getTyrePressure() {
        return tyrePressure;
    }

    public int getTyreAge() {
        return tyreAge;
    }


}
