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
public class Taco {
    String filling;
    String tortilla;
    
    public void setFilling (String filling){
        this.filling = filling;
    }
    
    public static void main(String[] args){
        Taco taco = new Taco();
        taco.setFilling("Sammen");
    }
    
}
