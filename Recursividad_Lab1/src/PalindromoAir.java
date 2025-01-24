
import recursividad_lab1.Ticket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 50494
 */
public class PalindromoAir{
    Ticket[] asientos = new Ticket[30];
    final double TicketPrecio = 800;
    
    public int firstAvailable(int i){
        if (i >= asientos.length) 
            return -1; 
        if (asientos[i] == null) 
            return i; 
        return firstAvailable(i+1);
    }
    
    public int searchPassenger(String name, int i){
         if (i >= asientos.length) 
            return -1; 
         if (asientos[i] != null && asientos[i]) {
            
        }
    }
    
    public boolean isPalindromo(String name){
    }
    
    public void printPassengers(){
    }
    
    public double income(){
    }
    
    public void sellTicket(String name){
    }
    
    public boolean cancelTicket(String name){
    }
    
    public void dispatch(){
    }
   
}
