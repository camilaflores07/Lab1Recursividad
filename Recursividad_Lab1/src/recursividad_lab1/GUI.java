/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad_lab1;

import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author chung
 */
public class GUI {
   static JFrame frame = new JFrame();
   static JPanel panel1 = new JPanel();
   static JPanel panel2 = new JPanel();
   static JButton btnBuscarAsientos = new JButton();
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
   
   
   public static void pantallaInicio(){
   frame.setTitle("Lab 1: Recursividad");
   frame.setSize(500,500);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLayout(new BorderLayout());
   
   panel1 = new JPanel(new BoxLayout (panel1, BoxLayout.X_AXIS));
   panel1.setBackground(Color.white);
   frame.add(panel1, BorderLayout.NORTH);
   
   panel2.setBackground(Color.white);
   frame.add(panel2, BorderLayout.SOUTH);
   
   labelNombre.setText("Nombre: ");
   labelNombre.setForeground(Color.PINK);
   labelNombre.setFont(new Font("Arial", Font.BOLD, 40));
   labelNombre.setAlignmentX(Component.CENTER_ALIGNMENT);
   panel1.add(labelNombre);
   
   fieldNombre.setText("");
   fieldNombre.setMaximumSize(new Dimension(100,150));
   fieldNombre.setColumns(1);
   fieldNombre.setHorizontalAlignment(JTextField.CENTER);
   fieldNombre.setAlignmentX(Component.CENTER_ALIGNMENT);
   
   
   panel1.add(fieldNombre); 
   
   btnOk = btnPersonalizar(btnOk,"Ok");
   panel1.add(btnOk);
   
   frame.setVisible(true);
   
   }
    
}
