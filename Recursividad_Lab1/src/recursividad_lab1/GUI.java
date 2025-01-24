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
   static JFrame frameVender = new JFrame();
   static JFrame frameBuscar  = new JFrame();
   static JPanel panel1 = new JPanel();
   static JPanel panel2 = new JPanel();
   static JPanel panelVender = new JPanel();
   static JPanel panelBuscar = new JPanel();
   static JButton btnSalir = new JButton();
   static JButton btnVender = new JButton();
   static JButton btnCancelar = new JButton();
   static JButton btnBuscarPasajero = new JButton();
   static JButton btnImprimirPasajeros = new JButton();
   static JButton btnReset = new JButton();
   static JButton btnDespachar = new JButton();
   static JButton btnOk = new JButton();
   static JLabel labelNombre = new JLabel();
   static JLabel labelVender = new JLabel();
   static JLabel labelBuscar = new JLabel();
   static JTextField fieldNombre = new JTextField();
   static JFrame frameImprimir = new JFrame();
   static JPanel panelImprimir = new JPanel(new GridLayout(2,1,10,10));
   static JLabel labelImprimir = new JLabel();
   static JFrame frameDespachar = new JFrame();
   static JPanel panelDespachar = new JPanel();
   static JLabel labelDespachar = new JLabel();
   static JLabel labelPasajerosImpresos = new JLabel();
   
   
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
 
   return frame;
   }
   
   public static JLabel hacerLabelTitulo(JLabel label, String text){
    
    label.setText(text);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setForeground(Color.PINK);
    label.setFont(new Font("Arial" , Font.BOLD, 40));
    
    return label;
    }
   
   public static JLabel hacerLabel(JLabel label){
    
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setForeground(Color.BLACK);
    label.setFont(new Font("Arial" , Font.PLAIN, 20));
    
    return label;
    }
   
   public static void pantallaInicio(){
       frame2 = framePersonalizar(frame2);
       panel2 = new JPanel(new GridLayout(4,1,10,10));
       panelBuscar.setBackground(Color.WHITE);
       panel2.setBackground(Color.WHITE);
       frame2.add(panel2);
       
       
       //VENDER
       btnVender = btnPersonalizar(btnVender, "Vender");
       panel2.add(btnVender);
       
       labelVender = hacerLabelTitulo(labelVender, "Vender");
       panelVender.add(labelVender);
 
       
       
        frameVender = framePersonalizar(frameVender);
        panelVender.setForeground(Color.WHITE);
        frameVender.add(panelVender);
       
       //BUSCAR PASAJERO
       frameBuscar = framePersonalizar(frameBuscar);
       panelBuscar.setForeground(Color.WHITE);
       frameBuscar.add(panelBuscar);
       
       btnBuscarPasajero = btnPersonalizar(btnBuscarPasajero, "Buscar Pasajeros");
       panel2.add(btnBuscarPasajero);
       
       
       labelBuscar = hacerLabelTitulo(labelBuscar, "Imprimir Pasajeros");
       panelBuscar.add(labelBuscar);
       
      
       
        
       //IMPRIMIR PASAJEROS
       frameImprimir = framePersonalizar(frameImprimir);
       panelImprimir.setForeground(Color.WHITE);
       frameImprimir.add(panelImprimir);
       
       btnImprimirPasajeros = btnPersonalizar(btnImprimirPasajeros, "Imprimir Pasajeros");
       panel2.add(btnImprimirPasajeros);
       
       
       labelImprimir = hacerLabelTitulo(labelBuscar, "Imprimir Pasajeros");
       panelImprimir.add(labelImprimir);
       
       labelPasajerosImpresos= hacerLabel(labelPasajerosImpresos);
       panelImprimir.add(labelPasajerosImpresos);
       
       //DESPACHAR
       frameDespachar = framePersonalizar(frameDespachar);
       panelDespachar.setForeground(Color.WHITE);
       frameDespachar.add(panelDespachar);
       
       btnDespachar = btnPersonalizar(btnDespachar, "Despachar");
       panel2.add(btnDespachar);
       
      
       labelDespachar = hacerLabelTitulo(labelDespachar, "Despachar");
       panelDespachar.add(labelDespachar);
       
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
