package HW_2;

public abstract class MarineAnimal implements SwimmingSpeed {
    private String name;

    public MarineAnimal(String name){
        this.name = name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name: %s, speed: %d, feed: %s", name, speed(), feed());
    }
}
