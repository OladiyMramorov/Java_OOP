package HW_2;

public class Duck extends Herbivores {
    public Duck(String name) {
        super(name);
    }

    @Override
    public int speed(){
        return 30;
    }
}
