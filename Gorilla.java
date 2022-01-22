public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething() {
		System.out.println("Gorilla has thrown something.");
		this.energyLevel -= 5;
	}
	public void eatBanana() {
		System.out.println("Gorilla has eaten a banana.");
		this.energyLevel += 10;
	}
	public void climb() {
		System.out.println("Gorilla has climbed the fence and escaped, and is now eating a toddler!");
		this.energyLevel -= 10;
	}
}