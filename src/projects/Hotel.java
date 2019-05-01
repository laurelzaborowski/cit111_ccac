/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

/**
 *
 * @author laurel.zaborowski
 */
public class Hotel {

    int roomsAvailable;
    int numberOfRooms;
    String name;
    int pricePerNight;
    boolean hasPool;

    public void printHotelStats() {
        System.out.println("Name of Hotel: " + name);
        System.out.println("Rooms Available: " + roomsAvailable);
        System.out.println("Total in hotel: " + numberOfRooms);
        System.out.println("Price per night: " + pricePerNight);
        System.out.println("Pool: " + hasPool);
        
    } // close method  

} // close class 
