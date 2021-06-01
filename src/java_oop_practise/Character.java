/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_oop_practise;

import com.sun.javafx.sg.prism.NGTriangleMesh;

/**
 *
 * @author HimathH
 */
public class Character {

    /**
     * @param args the command line arguments
     */
    private String name;
    private String sex;
    
    public Character(String name, String sex){
        this.name = name;
        this.sex= sex;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Character thisath = new Character("Thisath", "Male");
        Character madu = new Character("Madhu", "Female");
    }
    
}
