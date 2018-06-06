package objectmasterpackage;

public class Samurai extends Human {
	public static int samInstances = 0;
	public Samurai() {
		health = 200;
		samInstances += 1;
	}
	
	public Samurai deathBlow(Human victim) {
		System.out.println("*Focuses energy* This otta do it...");
		victim.die();
		health = health / 2;
		return this;
	}
	
	public Samurai meditate() {
		health += health / 2;
		return this;
	}
	
	public Samurai howMany() {
		System.out.println("There are currently " + samInstances + " Samurai(s).");
		return this;
	}
}
