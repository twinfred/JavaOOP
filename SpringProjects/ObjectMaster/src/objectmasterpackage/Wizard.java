package objectmasterpackage;

public class Wizard extends Human {
	public Wizard() {
		health = 50;
		intelligence = 8;
	}
	
	public Wizard heal(Human target) {
		target.increaseHealth(intelligence);
		System.out.println("Please be silent while I heal this pathetic being...");
		return this;
	}
	
	public Wizard fireball(Human victim) {
		victim.reduceHealth(intelligence);
		System.out.println("That was my best fire attack yet!");
		return this;
	}
}
