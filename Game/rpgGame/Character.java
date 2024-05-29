package rpgGame;

public abstract class Character {
	String name;
	int health;
	int attackPower;
	int defense;
	
	public Character(String name, int health, int attackPower, int defense) {
		this.name = name;
		this.health = health;
		this.attackPower = attackPower;
		this.defense = defense;
	}
	
	public abstract void attack(Character target);
	
	public boolean isAlive() {
		return this.health > 0;
	}
	
	public void takeDamage(int damage) {
		this.health -= damage;
	}
}
