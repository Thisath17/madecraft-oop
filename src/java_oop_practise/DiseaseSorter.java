/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_oop_practise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HimathH
 */
public class DiseaseSorter {
    
    public static void main(String[] args){
        
        Disease polio = new Disease("Polio", false);
        Disease flu = new Disease("Flu", true);
        Disease cancer = new Disease("Cacer", false);
        Disease maleria = new Disease("Maleria", true);
        
        List<Disease> diseaseList = new ArrayList<Disease>();
        diseaseList.add(flu);
        diseaseList.add(polio);
        diseaseList.add(cancer);
        diseaseList.add(maleria);
        
        // Adding the setter to cancer variable
        cancer.setCurable(true);
        
        System.out.println("Curable diseses : ");
        for (Disease disease : diseaseList){
            if (disease.isCurable()){
                System.out.println(disease.getName());
            }
        }
    }
}
