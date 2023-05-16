package HW_4;

public class NoShield implements Shield{
    @Override
    public int shieldProtection() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("No shield, max protection %d", shieldProtection());
    }
}
