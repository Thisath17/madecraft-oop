/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_oop_practise;

/**
 *
 * @author HimathH
 */
public class Pond {
    
    public static void main(String[] args){
        
        Duck duck1 = new Duck("One Duck", 6/3, "Snackes");
        Duck duck2 = new Duck("Go Duck", 25/5, "Cheespuff");
        
        duck1.waddle();
        duck2.quack();
        
        System.out.println(duck1);
    }
    
}
