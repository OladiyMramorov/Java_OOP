package HW_4;

public class EnglishShield implements Shield{
    @Override
    public int shieldProtection(){
        return 3;
    }

    @Override
    public String toString() {
        return String.format("English shield, max protection %d", shieldProtection());
    }
}
