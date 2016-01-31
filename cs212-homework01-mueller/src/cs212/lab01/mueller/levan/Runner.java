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
//Runner should only have a main method that starts the process, no longer than 3-4 LOC
public class Runner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Roller numRolls = new Roller();
        Counter counter = new Counter();
        System.out.println("Welcome to Die Roller 3000");
        
        System.out.println("How often would you like to report?");
        int report = input.nextInt();
        numRolls.roller(report, counter);

    }
}
