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
public class ExtraRandom extends Random{

        public String nextLetter(){
            //int asInt = (int)'a';
            int lettersStartAt = 97;
            int randomInt = new Random().nextInt(26) + lettersStartAt;
            return  ""+ (char)randomInt;
        }
    }

