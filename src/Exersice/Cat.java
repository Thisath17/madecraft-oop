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
public class Cat {
    private String cat_name;
    private int lives = 9;
    
    Cat(String cat_name){
        this.cat_name = cat_name;
    }
    
    void meaw(){
        System.out.println("Meawwwwwwww");
    }
    
    public void printCName(){
        if (cat_name!=null){
            System.out.println("Cat's Name is "+cat_name);
        } else {
            System.out.println("No cat in the System");
        }
    }
    
    public void kill(){
        lives--;
        if (lives > 0)
                System.out.println("nice try, but I still have " + lives + " lives left");
        else if (lives < 0)
                System.out.println("that's overkill yo!");
        else
                System.out.println("DEAD CAT :(");
    }
    
    
    public static void main(String[] args){
        
        Cat cat1 = new Cat("Alas");
        
        cat1.meaw();
        cat1.printCName();
        cat1.kill();
        
    }
}
