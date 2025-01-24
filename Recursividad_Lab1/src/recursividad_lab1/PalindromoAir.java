package recursividad_lab1;


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
         if (asientos[i] != null && asientos[i].getNombrePasajero().equals(name));
         return i;
    } 
    public boolean isPalindromo(String name, int start, int end) {
    if (start >= end) {
        return true;
    }
    if (name.charAt(start) != name.charAt(end)) {
        return false;
    }
    return isPalindromo(name, start + 1, end - 1); 
    }
    
    public void printPassengers(int i){
       if (i >= asientos.length) {
        return; 
    }
    if (asientos[i] != null) {
        System.out.println(asientos[i].getNombrePasajero() + " - " + TicketPrecio);
    }
    printPassengers(i + 1);
    }
    
    public double income(int i){
        if (i >= asientos.length) {
        return 0; 
    }
        if (asientos[i] != null) {
            return TicketPrecio + income(i + 1);
        }
        return i +1;  
        }
    
    public void sellTicket(String name, int i){
        if (i>= asientos.length) {

            System.out.println("No hay sillas disponibles");
            
            
        }
        if(asientos[i]== null){
            double precio= TicketPrecio
            
        }
        
    }
    
    public boolean cancelTicket(String name){
    }
    
    public void dispatch(){
    }
}
   
