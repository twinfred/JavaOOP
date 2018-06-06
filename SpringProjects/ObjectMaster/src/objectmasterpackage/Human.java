package objectmasterpackage;

public class Human {
	
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	
	public Human() {
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	
	public Human attack(Human victim) {
		victim.reduceHealth(strength);
		System.out.println("Attack!");
		return this;
	}
	
	public void reduceHealth(int damage) {
		health -= damage;
		return;
	}
	
	public void increaseHealth(int life) {
		health += life;
		return;
	}
	
	public void die() {
		health = 0;
		System.out.println("Death becomes you, puny mortal.");
		return;
	}
	
	public void displayHealth() {
		System.out.println("Health is: " + health);
	}
}
