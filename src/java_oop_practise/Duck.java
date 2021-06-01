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
public class Duck {
    // Member variables 
    private String name;
    private int age;
    private String fav_food;
    
    // Constructor
    public Duck(String name, int age, String fav_food){
        super();
        this.name = name;
        this.age = age;
        this.fav_food = fav_food;
    }
    
    // Methods 
    void waddle() {
        age++;
        System.out.println(this.name+" do Waddle Waddle!!!");
    }
    
    void quack() {
        System.out.println(this.name+" say Quack Quack!!!");
    }
    
    @Override
    public String toString() {
        return "Duck's Name is " + name + " it's faverite food is " +fav_food+"\nNew Age is " + age;
    }
}
