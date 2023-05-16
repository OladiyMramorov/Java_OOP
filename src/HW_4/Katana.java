package HW_4;

public class Katana implements Weapon{
    @Override
    public int damage() {
        return 15;
    }

    public int range(){
        return 2;
    }

    @Override
    public String toString() {
        return String.format("Knife, max damage %d, max range %d", damage(), range());
    }
}
