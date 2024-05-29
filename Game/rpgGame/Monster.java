package rpgGame;

public class Monster extends Character {
    public Monster(String name, int health, int attackPower, int defense) {
        super(name, health, attackPower, defense);
    }

    @Override
    public void attack(Character target) {
        target.takeDamage(this.attackPower - target.defense);
        System.out.println(name + " ��  " + target.name + " (��)�� �����Ѵ�. " + attackPower  + " ������ ��ŭ");
    }
}

