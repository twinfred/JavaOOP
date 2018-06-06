package objectmasterpackage;

public class HumanTest {
	public static void main(String[] args) {
		System.out.println("Bob and Tom are Humans...");
		Human bob = new Human();
		Human tom = new Human();
		bob.attack(tom);
		tom.displayHealth();
		bob.attack(tom).attack(tom);
		tom.displayHealth();
		
		System.out.println("Leo is a Wizard...");
		Wizard leo = new Wizard();
		leo.heal(tom);
		tom.displayHealth();
		leo.fireball(bob);
		bob.displayHealth();
		
		System.out.println("Max is a Ninja...");
		Ninja max = new Ninja();
		max.steal(leo);
		leo.displayHealth();
		max.displayHealth();
		max.runAway();
		max.displayHealth();
		
		System.out.println("Sue is a Samurai...");
		Samurai sue = new Samurai();
		sue.deathBlow(tom);
		tom.displayHealth();
		sue.displayHealth();
		sue.meditate();
		sue.displayHealth();
		sue.howMany();
		
		System.out.println("Another Samurai has joined the party... meet Tao...");
		Samurai tao = new Samurai();
		tao.howMany();
	}
}
