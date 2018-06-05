package objectmasterpackage;

public class HumanTest {
	public static void main(String[] args) {
		Human bob = new Human();
		Human tom = new Human();
		bob.attack(tom);
		tom.displayHealth();
		bob.attack(tom).attack(tom);
		tom.displayHealth();
	}
}
