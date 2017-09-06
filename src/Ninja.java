//Create Ninja class that extends from the Human class.
//Ninja: Set default stealth to 10
public class Ninja extends Human{
	private int stealth = 10;
	
//Ninja: Add a method steal(Human) that takes the amount of stealth the ninja has,
//removes it from the other human's health, and adds it to the ninja's
	public void steal(Human h) {
		System.out.println("Stealing health");
		h.health = h.health - stealth;
		health = health + stealth;
	}
//Ninja: Add a method runAway() that decreases their health by 10
	public void runAway() {
		System.out.println("Running Away");
		health = health - 10;
	}
}

