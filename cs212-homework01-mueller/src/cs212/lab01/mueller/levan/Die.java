/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs212.lab01.mueller.levan;

/**
 *
 * @author jordan.mueller
 */
//should only have one method
public class Die {
    
    public Die(int sides){
        INTMAX = sides;
    }

    final int INTMIN = 1;
     int INTMAX = 6;
    /*private int side;
     public Die(int s){
     side = s;*/

    public int roll() {
        return (int) (Math.random() * (INTMAX - INTMIN + 1) + INTMIN);
        //(Math.random() * (range + 1)) + min;

    }

}
