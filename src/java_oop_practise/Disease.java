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
public class Disease {
    // Variables
    private String name;
    private boolean curable;

    // Constructor
    Disease(String name, boolean isCurable) {
        this.name = name;
        this.curable = isCurable;
    }
    
    boolean isCurable(){
        return this.curable;
    }
    
    String getName(){
        return this.name;
    }
    
    void setCurable(boolean curable){
        this.curable = curable;
    }
}
