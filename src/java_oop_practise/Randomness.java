/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_oop_practise;

import java.util.Random;

/**
 *
 * @author HimathH
 */
public class Randomness {
    
    public static void main (String[] args){
        ExtraRandom random = new ExtraRandom();
        
        System.out.println(random.nextBoolean());
        
        System.out.println(random.nextLetter());
    }
    
}
