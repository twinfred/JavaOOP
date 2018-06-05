package zookeeperpackage;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	public Bat fly() {
		energyLevel -= 50;
		System.out.println("*wings flapping*");
		return this;
	}
	
	public Bat eatHumans() {
		energyLevel += 25;
		System.out.println("Die silly humannnnnnnnnn!!!!!!");
		return this;
	}
	
	public Bat attackTown() {
		energyLevel -= 100;
		System.out.println("Wait, bats breath fire now... wtf, dude!");
		return this;
	}
}
