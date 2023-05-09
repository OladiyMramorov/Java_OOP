package HW_2;

public class Dolphin extends Herbivores{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public int speed() {
        return 100;
    }
}
