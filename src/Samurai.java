//Create Samurai class that extends from the Human class.
//Samurai: Set a default health of 200

public class Samurai extends Human{
	private int health = 200;
	private static int counter;
	
	public Samurai() {
		this.health = 200;
		counter++;
		
	}
//Samurai: Add a method deathBlow(Human) that kills the other human, but reduces the Samurai's health by half
	public void deathBlow(Human h) {
		System.out.println("Death Blowing");
		h.health = 0;
		health = health /2;
	}
//Samurai: Add a method meditate() that heals the Samurai for half of their current health.
	public void meditate() {
		health = health + health/2;
	}
//Samurai: Add a method howMany() that returns the total current number of Samurai.
	public void howMany() {
		System.out.println("There are " + counter + "Samurai");
	}
}
