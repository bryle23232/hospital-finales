/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author bryle
 */



public class Homepage extends JFrame implements ActionListener{
   
     JLabel l1;
    JButton btnPatient, btnInformation,  btnLogout;
   
                    
   
   

  Homepage(){
    setResizable(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setExtendedState( JFrame.MAXIMIZED_BOTH);
      getContentPane().setBackground(new Color(240, 247, 255));
    
    
    
   l1 = new JLabel("HOSPITAL MANGEMENT SYSTEM");
     l1.setBounds(845, 20, 300, 50);
     l1.setFont(new Font("Rockwell", Font.ITALIC, 20));
     add(l1);
     
     btnPatient = new JButton ("Add New Patient Record");
     btnPatient.setVisible(true);
     btnPatient.setBounds(20, 200, 300, 75);
     btnPatient.setFont(new Font("Rockwell", Font.ITALIC ,20));
     add(btnPatient);
     btnPatient.addActionListener(this);
     
     
     btnInformation = new JButton ("Hospital Information");
     btnInformation.setVisible(true);
     btnInformation.setBounds(20, 400, 300, 75);
     btnInformation.setFont(new Font("Rockwell", Font.ITALIC,20));
     add( btnInformation);
     btnInformation.addActionListener(this);
     
     
     btnLogout = new JButton ("Logout");
     btnLogout.setVisible(true);
     btnLogout.setBounds(20, 600, 300, 75);
     btnLogout.setFont(new Font("Rockwell", Font.ITALIC,20));
     add( btnLogout);
     btnLogout.addActionListener(this);
     
     
   
    
  }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnPatient) {
            dispose();
             Patient P = new Patient();
             P.setVisible(true);
        } 
        else if (ae.getSource() == btnLogout) {
            dispose();
            Login login = new Login();
            login.setVisible(true);
        } 
        else if (ae.getSource() == btnInformation) {
            dispose();
            Information I = new Information();
            I.setVisible(true);
             
            

        }
    }
}