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
public class Athlete {
    
    private String name;
    private int speed;
    private String marathonLocation;

    
    public Athlete(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
        
    public void setmarathonLocation(String marathonLocation){
        this.marathonLocation = marathonLocation;
    }
            
    @Override
    public String toString(){
        return "Athlete "+name+" is running at "+speed+" mile per hour at "+marathonLocation ;
    }
    
}
