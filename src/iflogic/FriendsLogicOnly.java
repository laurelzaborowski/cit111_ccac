/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iflogic; 

import java.util.Scanner;

/**
 *
 * @author laurel.zaborowski
 */
public class FriendsLogicOnly {

    public static void main(String[] args) {
        // hard-coded response to question 1
        int response = 0;
        // compatability score: this variable will be adjusted based on
        // the user's response to questions
        int compScore = 0; 
        Scanner keyboardScanner = new Scanner(System. in);
        
        System.out.println("Do you like to read? (0 = no, 1 = yes)");
        response = keyboardScanner.nextInt ();
        // TODO: wire up actual user input when logic works
        
        // once we have the response saved, implement our decision logic
        if(response == 1){
            compScore = compScore + 10; 
            System.out.println("Awesome, me too!");
        } else {
            System.out.println("Word of advice, books are good for your soul");
            compScore = compScore - 10; 

        } // end if/else blocks
        
        
        System.out.println ("Do you like scary movies? 0 = no, 1 = yes"); 
        response = keyboardScanner.nextInt();
        if (response == 1){
            compScore = compScore + 10;
            System.out.println ("My favorite!");
        } else { 
            System.out.println("Ya big baby!"); 
            compScore = compScore - 10;
        } 
        
        
        System.out.println ("Do you like to eat Ichiban? 0 = no, 1 = yes"); 
        response = keyboardScanner.nextInt();
        if (response == 1) {
            compScore = compScore + 10;
            System.out.println("You can find me there about 3 times a week");  
        } else { 
            System.out.println("Unheard of!"); 
            compScore = compScore - 20; 
                   
        } 
        
        
        System.out.println("Do you enjoy being outdoors? 0 = no, 1 = yes");
        response = keyboardScanner.nextInt();
        if (response == 1) {
            compScore = compScore + 10;
            System.out.println("Nothing like a breath of fresh air");
        } else { 
            System.out.println("Sunshine is the best vitamin"); 
            compScore = compScore - 10; 
        }// close else    
        
        System.out.println("Do you like hair, nails, makeup, etc? 0 = no, 1 = yes"); 
        response = keyboardScanner.nextInt();
        if (response == 1) {
            compScore = compScore + 10; 
            System.out.println("Perfect!"); 
                    
        } else { 
            System.out.println("Hope you like makeovers!");
            compScore = compScore -10;
        }//close else 
        
        // final check of compatibility score
        if(compScore > 20){
            System.out.println("Great, we might be friends!");
        } else {
            System.out.println("Yikes, according to my decision tree, "
                    + "we probably wouldn't make good friends.");
            
        } // end of if/else blocks
    } // close main
} //close class
