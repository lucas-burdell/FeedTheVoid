/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs212.lab01.mueller.levan;

import java.util.Scanner;

/**
 *
 * @author jordan.mueller
 */
public class Roller {

    int rolls;
    
    

    public int roller(int report, Counter counter) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many dice do you want?");
        int numDie = input.nextInt();
        System.out.println("What size die would you like to use?");
        int sides = input.nextInt();
        Die d1 = new Die(sides);
        counter.setArray(numDie, sides);
        System.out.println("How many times would you like to roll?");
        rolls = input.nextInt();
        System.out.println("OK! Rolling...");
        for (int i = 0; i < rolls; i++) {
            int dieSum = 0;
            for (int j = 0; j < numDie; j++) {
                dieSum = d1.roll() + dieSum;
            }
            counter.count(i + 1, report, dieSum);

        }
        
        return rolls;
    }

}
