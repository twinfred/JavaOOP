package zookeeperpackage;

public class Gorilla extends Mammal {
	public Gorilla throwSomething() {
		energyLevel -= 5;
		System.out.println("This gorilla is throwing something");
		return this;
	}
	
	public Gorilla eatBananas() {
		energyLevel += 10;
		System.out.println("Nom nom, yummy bananas!");
		return this;
	}
	
	public Gorilla climb() {
		energyLevel -= 10;
		System.out.println("Climbing is awesome");
		return this;
	}
}
