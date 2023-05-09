package HW_2;

public class SeaLion extends Predator{
    public SeaLion(String name) {
        super(name);
    }

    @Override
    public int speed() {
        return 80;
    }
}