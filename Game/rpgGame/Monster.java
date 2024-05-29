package rpgGame;

public class Monster extends Character {
    public Monster(String name, int health, int attackPower, int defense) {
        super(name, health, attackPower, defense);
    }

    @Override
    public void attack(Character target) {
        target.takeDamage(this.attackPower - target.defense);
        System.out.println(name + " 이  " + target.name + " (을)를 공격한다. " + attackPower  + " 데미지 만큼");
    }
}

