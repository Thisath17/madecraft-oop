/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exersice;

/**
 *
 * @author HimathH
 */
public class Harry {

	private boolean cloakOn;

	Harry() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell) {
		System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;

		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {
            Harry harry1 = new Harry();
            String spell = "stupefy";

                // 1. make harry potter
		// 2. become invisible
                harry1.makeInvisible(true);
		// 3. spy on professor snape
                harry1.spyOnSnape();
		// 4. become visible again
                harry1.makeInvisible(false);
		// 5. cast a “stupefy” spell
                harry1.castSpell(spell);
	}

}