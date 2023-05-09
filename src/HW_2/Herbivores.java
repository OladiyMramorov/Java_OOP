package HW_2;

public abstract class Herbivores extends MarineAnimal {

    public Herbivores(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Grass";
    }
}
