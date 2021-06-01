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
public class Smurf {

	private static String name;

	public static Smurf createSmurf(String name1) {
            if (name==name1){
                System.out.println(name1+" Smurf already exist...");
            } else {
            	System.out.println("Creating " + name1 + " Smurf");
            }return new Smurf(name1);
	}

	private Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
