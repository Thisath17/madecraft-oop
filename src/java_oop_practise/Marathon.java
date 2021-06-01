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
public class Marathon {
    
    public static void main(String[] args){
        Athlete athlete1 = new Athlete("Rivija", 20);
        Athlete athlete2 = new Athlete("Kalum", 10);
        
        athlete1.setmarathonLocation("Kinigama");
        athlete2.setmarathonLocation("Bandarawela");
        
        System.out.println(athlete1);
        System.out.println(athlete2);
        
        System.out.println("Runners in the rase: "+Athlete.getRunnerInRace());
        
        
    }
}
