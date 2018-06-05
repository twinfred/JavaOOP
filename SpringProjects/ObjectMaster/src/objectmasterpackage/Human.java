package objectmasterpackage;

public class Human {
	
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	
	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	
	public Human attack(Human victim) {
		victim.reduceHealth(strength);
		return this;
	}
	
	public void reduceHealth(int damage) {
		health -= damage;
		System.out.println("Attack!");
		return;
	}
	
	public void displayHealth() {
		System.out.println("Health is: " + health);
	}
}
