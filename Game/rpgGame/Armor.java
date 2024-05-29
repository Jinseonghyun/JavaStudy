package rpgGame;

public class Armor {
    private String name;
    private int defensePower;

    public Armor(String name, int defensePower) {
        this.name = name;
        this.defensePower = defensePower;
    }

    public int getDefensePower() {
        return defensePower;
    }
}

