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
public class Counter {

    int[] counter;
    int numD1 = 0;
    
    //public 
    
    public void count(int i, int report, int dieSum) {
        //counter[dieSum - numD1 - 1] = counter[dieSum - numD1 - 1] + 1;
        counter[dieSum  - 1] = counter[dieSum - 1] + 1;
        if (i != 0 && i % report == 0) {
            System.out.println("After " + i + " rolls, the distribution is:");
            for(int j = 0; j < counter.length; j++){
                System.out.println(j + 1 + ": " + counter[j]);
            }
        }
        
    }

    public void setArray(int numDie, int INTMAX) {
        numD1 = numDie;
        //counter = new int[numDie * 6 - numDie];
        counter = new int[numDie * INTMAX];
    }
    
}
