//Test these methods work using a HumanTest class
public class HumanTest {

	public static void main(String[] args) {
		Human h = new Human();
		Human h2 = new Human(); 
		h.attack(h2);
		h2.showHealth();
		Wizard w = new Wizard();
		Samurai s = new Samurai();
		Ninja n = new Ninja();
		n.steal(w);
		w.showHealth();
		w.fireball(n);
		n.showHealth();
		s.deathBlow(n);
		n.showHealth();
		s.showHealth();
		w.heal(s);
		s.showHealth();
	}

}
