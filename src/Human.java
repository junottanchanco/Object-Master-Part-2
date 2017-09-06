//Create a human class
public class Human {
//	Add the strength, stealth, and intelligence attributes with a default of 3
//	Add the health attribute with a default of 100
	protected int strength = 3;
	protected int stealth= 3;
	protected int intelligence = 3;
	protected int health = 100;
//	Add the attack(Human) method that reduces the health of the attacked human by the strength of the current human
	
	public void attack(Human h) {
		this.health = h.health - strength - stealth - + intelligence;
	}
	public void showHealth() {
		System.out.println("Health" + health);
	}
}
