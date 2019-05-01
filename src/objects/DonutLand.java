/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 * Client class of our Donut class 
 * We make instances of Donut objects 
 * and populate their member variables
 * @author laurel.zaborowski
 */
public class DonutLand {
    public static void main(String[] args){ 
        // make (i.e. "instantiate") a Donut
        // and store a reference to that Object 
        // in variable called firstDonut 
        // of type Donut 
        Donut firstDonut = new Donut(); 
        firstDonut.flavor = "Chocolate frosted"; 
        firstDonut.size = "Large"; 
        firstDonut.name = "Mama Bear"; 
        firstDonut.percRemaining = 100;  
        
        
        Donut secondDonut = new Donut(); 
        secondDonut.flavor = "Chocolate"; 
        secondDonut.size = "Small"; 
        secondDonut.name = "Bubba"; 
        secondDonut.percRemaining = 100; 
        firstDonut.eatDonut(15); 
        secondDonut.eatDonut(50);
        printDonutStats(firstDonut); 
        printDonutStats(secondDonut); 
        
    } // close main 
    
    public static void printDonutStats(Donut d){ 
        System.out.println("Perc remaining of "
                + d.name + " is " + d.getPercentRemaining()
                + "%"); 
        
    }
    
    
    
    
} // close class 
