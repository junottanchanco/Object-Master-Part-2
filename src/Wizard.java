//Create Wizard class that extends from the Human class.
//Wizard: Set default health to 50
//Wizard: Set default intelligence to 8
public class Wizard extends Human{
	private int health = 50;
	private int intelligence = 8;
	
//	Wizard: Add a method heal(Human) that heals the other human by the wizard's intelligence
	public void heal(Human h) {
		System.out.println("Healing");
		h.health = h.health + intelligence;
	}
//	Wizard: Add a method fireball(Human) that decreases the other human's health by the wizard's intelligence * 3
	public void fireball(Human h) {
		System.out.println("Fireballing");
		h.health = h.health - (intelligence *3);
	}
}
