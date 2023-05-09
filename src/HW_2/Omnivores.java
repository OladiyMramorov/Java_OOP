package HW_2;

public abstract class Omnivores extends MarineAnimal{
    public Omnivores(String name) {
        super(name);
    }
    @Override
    public String feed(){
        return "Meat and Grass";
    }
}

