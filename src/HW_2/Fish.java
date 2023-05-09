package HW_2;

public class Fish extends Herbivores{
    public Fish(String name) {
        super(name);
    }

    @Override
    public int speed() {
        return 40;
    }
}
