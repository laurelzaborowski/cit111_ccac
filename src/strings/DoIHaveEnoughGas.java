/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author laurel.zaborowski
 */
public class DoIHaveEnoughGas {
    public static void main(String[] args) {
        int highwaymph = 28 ; 
        int gasremaining = 0;
        int miles = 0;
        
        Scanner keyboardScanner = new Scanner(System.in); 
        System.out.println("How many gallons of gas remain in your tank?") ;
        gasremaining = keyboardScanner.nextInt(); 
        System.out.println("How many miles until the next gas station?");
        miles = keyboardScanner.nextInt();
    }
}
