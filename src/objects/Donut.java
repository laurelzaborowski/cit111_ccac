/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 * :Blueprint" class that models a real-world donut; no main method     
 * @author laurel.zaborowski
 */
public class Donut {
    // Member variables 
    // Each instance of a Donut class 
    // will recieve each of these member variables 
    // and can customize their value 
    String name; 
    int percRemaining; 
    String size; 
    String flavor; 
    
    /** 
     * Simulates eating some percent of this 
     * donut
     * @param percentEaten 
     */
    public void eatDonut(int percentEaten){ 
        percRemaining = percRemaining - percentEaten;
        
    
} // close method 
    
    /** 
     * Accessor method for retrieving the value 
     * of the member variable : percRemaining;
     * @return the percent remaining 
     */
    
    public int getPercentRemaining(){ 
        return percRemaining; 
    }
    
} // close class 

