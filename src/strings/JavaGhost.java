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
public class JavaGhost {
    
    public static void main(String[] args) {  
        String username = "javaghost" ; 
        String password = "ic0d3";  
        boolean areStringsEqual = username.equals(password); 
        
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Enter your username followed by enter:") ; 
        System.out.println("Enter your passowrd followed by enter:"); 
        username = keyboardScanner.next(); 
        password = keyboardScanner.next();  
        
    } // close class
} // close main
