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

    public int firstAvailable(int i) {
        if (i >= asientos.length) {
            return -1; 
        }
        if (asientos[i] == null) {
            return i; 
        }
        return firstAvailable(i + 1);
    }

    public int searchPassenger(String name, int i) {
        if (i >= asientos.length) {
            return -1; 
        }
        if (asientos[i] != null && asientos[i].getNombrePasajero().equals(name)) {
            return i; 
        }
        return searchPassenger(name, i + 1);
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
}
  
//    return isPalindromo(name, start + 1, end - 1); 
//    }
//    
//    public void printPassengers(){
//    }
//    
//    public double income(){
//    }
//    
//    public void sellTicket(String name){
//    }
//    
//    public boolean cancelTicket(String name){
//    }
//    
//    public void dispatch(){
//    }
//   
