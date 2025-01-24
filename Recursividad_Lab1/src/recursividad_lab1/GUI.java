/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad_lab1;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author chung
 */
public class GUI {
   static JFrame frame2 = new JFrame();
   static JFrame frame1 = new JFrame();
   static JPanel panel1 = new JPanel();
   static JPanel panel2 = new JPanel();
   static JButton btnSalir = new JButton();
   static JButton btnVender = new JButton();
   static JButton btnCancelar = new JButton();
   static JButton btnBuscarPasajero = new JButton();
   static JButton btnImprimirPasajeros = new JButton();
   static JButton btnReset = new JButton();
   static JButton btnDespegar = new JButton();
   static JButton btnOk = new JButton();
   static JLabel labelNombre = new JLabel();
   static JTextField fieldNombre = new JTextField();
   
   
   public static JButton btnPersonalizar(JButton btn, String texto){
   btn.setFocusable(false);
   btn.setText(texto);
   btn.setSize(50,50);
   btn.setBackground(Color.PINK);
   btn.setForeground(Color.WHITE);
   btn.setFont(new Font("Arial", Font.BOLD,20));
   
   return btn;
   }
   
   public static JFrame framePersonalizar ( JFrame frame){
   
   frame.setTitle("Lab 1: Recursividad");
   frame.setSize(500,500);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//   frame.setLayout(new BorderLayout());
 
   return frame;
   }
   
   public static void pantallaInicio(){
       frame2 = framePersonalizar(frame2);
       panel2 = new JPanel(new GridLayout(5,1,10,10));
       panel2.setBackground(Color.WHITE);
       frame2.add(panel2);
       
       btnVender = btnPersonalizar(btnVender, "Buscar Asiento Vacio");
       panel2.add(btnVender);
       
       btnCancelar = btnPersonalizar(btnCancelar, "Cancelar boleto");
       panel2.add(btnCancelar);
       
       btnBuscarPasajero = btnPersonalizar(btnBuscarPasajero, "Buscar pasajero");
       panel2.add(btnBuscarPasajero);
       
       btnImprimirPasajeros= btnPersonalizar(btnImprimirPasajeros, "Imprimir pasajeros");
       panel2.add(btnImprimirPasajeros);
       
       btnDespegar= btnPersonalizar(btnDespegar,"Despegar");
       panel2.add(btnDespegar);
       
       frame2.setVisible(true);
       
   
   }
   
   public static void pantallaNombre(){
   
   
   panel1 = new JPanel(new GridLayout(2,2,10,10));
   panel1.setBackground(Color.white);
   frame2.add(panel1);
   
   labelNombre.setText("Nombre: ");
   labelNombre.setForeground(Color.PINK);
   labelNombre.setFont(new Font("Arial", Font.BOLD, 40));;
   panel1.add(labelNombre);
   
   fieldNombre.setText("");
   fieldNombre.setMaximumSize(new Dimension(100,150));
   fieldNombre.setColumns(1);
   fieldNombre.setHorizontalAlignment(JTextField.CENTER);
   fieldNombre.setAlignmentX(Component.CENTER_ALIGNMENT);
   
   
   panel1.add(fieldNombre); 
   
   btnOk = btnPersonalizar(btnOk,"Ok");
   panel1.add(btnOk);
   
   btnSalir = btnPersonalizar(btnSalir, "Cancelar");
   
   btnSalir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        frame2.dispose();
        }
    });
   
   frame2.setVisible(true);
   
   }
    
}
