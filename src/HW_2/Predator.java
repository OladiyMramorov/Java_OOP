package HW_2;

public abstract class Predator extends MarineAnimal {
    public Predator(String name) {
        super(name);
    }
    @Override
    public String feed(){
        return "Meat";
    }
}
