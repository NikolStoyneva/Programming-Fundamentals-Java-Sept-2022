package ObjectsAndClasses.Exercise.P07GroomingSalon;

public class Pet {
    private String name;
    private int age;
    private String owner;

    public Pet (String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }


    @Override
    public String toString() {
        return String.format("%s %d - (%s)", name, age, owner);
    }
}
