package objectmasterpackage;

public class Ninja extends Human {
	public Ninja() {
		stealth = 10;
	}
	
	public Ninja steal(Human target) {
		System.out.println("Life drain and gain, baby!");
		target.reduceHealth(stealth);
		health += stealth;
		return this;
	}
	
	public Ninja runAway() {
		health -= 10;
		System.out.println("Runnnn!");
		return this;
	}
}
