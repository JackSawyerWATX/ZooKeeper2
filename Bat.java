public class Bat extends Mammal {
	public Bat(int energyLevel) {
		super(energyLevel);
	}
	public void fly() {
		System.out.println("Flap, flap, flap... I'm a bat that's taking flight!");
		this.energyLevel -= 50;
	}
	public void eatPeople() {
		System.out.println("Soylent Green now has LESS SALT!");
		this.energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("So much destruction! So many people burning alive in their melting skin! The smell is atrocious!");
		this.energyLevel -= 100;
	}
}