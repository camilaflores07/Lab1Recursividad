/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad_lab1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import static recursividad_lab1.GUI.btnDespachar;
import static recursividad_lab1.GUI.frame2;
import static recursividad_lab1.GUI.frameDespachar;

/**
 *
 * @author chung
 */
public class Recursividad_Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUI.pantallaInicio();
        PalindromoAir PalindromoAir = new PalindromoAir();
        
       
        
         GUI.btnImprimirPasajeros.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        GUI.frame2.dispose();
        GUI.frameImprimir.setVisible(true);
        PalindromoAir.printPassengers(0);
        }
        });
        
        GUI.btnVender.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        GUI.frame2.dispose();
        GUI.frameVender.setVisible(true);
        
        int num = PalindromoAir.firstAvailable(0);
        if(num != 1){
            int opcion=0;
        JOptionPane.showConfirmDialog(null, "El asiento " + num + " esta vacio. Desea venderlo?");
            if(opcion == JOptionPane.YES_OPTION){
            String nombre;
            nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
            PalindromoAir.sellTicket(nombre,0);
            GUI.frameVender.setVisible(false);
            GUI.frame2.setVisible(true);
                }
            }
            else{
            GUI.frameVender.setVisible(false);
            GUI.frame2.setVisible(true);
            
            }
        
            
        }
        
        
        
        });
        btnDespachar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        frame2.dispose();
        frameDespachar.setVisible(true);
        PalindromoAir.dispatch();
        }
        });
       
    
}}
