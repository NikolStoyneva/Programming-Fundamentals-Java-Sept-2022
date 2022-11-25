package ObjectsAndClasses.MoreExercise.P02RawData;

public class Engine {

    private int speed;
    private int power;

    public Engine (int speed, int power) {
        this.power = power;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }
}
