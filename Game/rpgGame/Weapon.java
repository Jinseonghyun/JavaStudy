package rpgGame;

public class Weapon {
    private String name;
    private int attackPower;

    public Weapon(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }
}

