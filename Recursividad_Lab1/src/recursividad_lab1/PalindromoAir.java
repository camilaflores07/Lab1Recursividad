package recursividad_lab1;


import javax.swing.JOptionPane;

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
       JOptionPane.showMessageDialog(null, asientos[i].getNombrePasajero() + " - " + TicketPrecio);
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
    
    public void reset(int i) {
    if (i >= asientos.length) {
        return;
    }
    asientos[i] = null; 
    reset(i + 1); 
}
    
    public void sellTicket(String name, int i){
        if (i>= asientos.length) {
            JOptionPane.showMessageDialog(null, "No hay asientos disponibles");
            return;
            
            
        }
        if(asientos[i]== null){
            double precio= TicketPrecio;
            precio = 800;
            if ( isPalindromo(name,0,name.length()-1)){
            precio-= (0.2)*TicketPrecio;
                    }
                    asientos[i]=new Ticket(name,precio);
                     JOptionPane.showMessageDialog(null, "Ticket vendido para " + name + ". Total a pagar: $" + precio);
                     return;
        }
         sellTicket(name, (i+1));
        
    }
 
     public boolean cancelTicket(String name, int i) {
        if (i >= asientos.length) return false;
        if (asientos[i] != null && asientos[i].getNombrePasajero().equals(name)) {
            asientos[i] = null;
            return true;
        }
        return cancelTicket(name, i + 1);
    }
     
      public void dispatch() {
    double totalIncome = income(0); 
    JOptionPane.showMessageDialog(null, "Ingreso total: $" + totalIncome);

    reset(0);

    JOptionPane.showMessageDialog(null, "El avión ha sido despachado. Todos los asientos estan vacios.");
}
}
   
   
