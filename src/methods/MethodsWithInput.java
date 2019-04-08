/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author laurel.zaborowski
 */
public class MethodsWithInput {
    public static void main(String[] args){ 
        
        addNumbers(2, 3); 
        
    } // close main 
    
    /** 
     * Adds the input parameters and prints result 
     * @param a 
     * @param b 
     */ 
    public static void addNumbers(int a, int b){ 
        int result = a + b; 
        System.out.println("Result: " + result);
      
    } // close method addNumbers
    
} // close class
