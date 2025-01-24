/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad_lab1;

/**
 *
 * @author 50494
 */
public class Ticket {
    String NombrePasajero;
    double totalpagar;

    public Ticket(String NombrePasajero, double totalpagar) {
        this.NombrePasajero = NombrePasajero;
        this.totalpagar = totalpagar;
    }

    public String getNombrePasajero() {
        return NombrePasajero;
    }

    public double getTotalpagar() {
        return totalpagar;
    }
    
    public void print(){
        System.out.println("El nombre del pasajero es: " + NombrePasajero);
        System.out.println("El pasajero " + NombrePasajero + "debe de pagar: " + totalpagar);
 } 
}

    

  
    
 

