package rpgGame;

public class Player extends Character {
    private Weapon weapon;
    private Armor armor;

    public Player(String name, int health, int attackPower, int defense) {
        super(name, health, attackPower, defense);
    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void equipArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public void attack(Character target) {
        int totalAttack = this.attackPower + (weapon != null ? weapon.getAttackPower() : 0);
        target.takeDamage(totalAttack - target.defense);
        System.out.println(name + " 이  " + target.name + " (을)를 공격한다. " + totalAttack + " 데미지 만큼");
    }
}

