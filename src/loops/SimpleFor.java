/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author laurel.zaborowski
 */
public class SimpleFor {

    public static void main(String[] args) {
        int loopControl = 5;
        String phrase;

        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Enter number of loops");
            loopControl = keyboardScanner.nextInt();
            System.out.println("Enter phrase to be repeated");
            phrase = keyboardScanner.next();

        for(int numLoops =0; numLoops < loopControl; numLoops = numLoops +1) {
            System.out.println(phrase + " " + numLoops);

        }//end for
    }// close main
}// close class
